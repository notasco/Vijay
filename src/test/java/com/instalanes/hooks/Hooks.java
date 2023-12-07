package com.instalanes.hooks;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.instalanes.factory.DriverFactory;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.Screenshot;

public class Hooks {
	@AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        try {
            if (isSessionActive()) {
                Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(DriverFactory.getDriver());
                scenario.attach(imageToBytes(screenshot.getImage()), "image/png", "");  
                System.out.println("Screenshot embedded in Extent Report.");
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
    private byte[] imageToBytes(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        return baos.toByteArray();
    }
    private boolean isSessionActive() {
        try {         
            return DriverFactory.getDriver().getWindowHandles().size() > 0;
        } catch (Exception e) { 
            return false;
        }
    }
}