package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectDriverMenuOptionListener implements ActionListener {
	private DriverManager driverManager;
	private Job2dDriver driver = null;

	public SelectDriverMenuOptionListener(Job2dDriver driver, DriverManager driverManager) {
		this.driverManager = driverManager;
		this.driver = driver;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MacroDecoratorDriver mDriver = new MacroDecoratorDriver();
		mDriver.setDriver(driver);
		driverManager.setCurrentDriver(mDriver);
		DriverFeature.updateDriverInfo();
	}
}
