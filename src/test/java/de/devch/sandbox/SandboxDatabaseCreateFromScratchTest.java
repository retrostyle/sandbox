/*
 * Copyright (c) 2012 Christian Soth
 * See the file license.txt for copying permission.
 */
package test.java.de.devch.sandbox;

import static org.junit.Assert.assertEquals;

import main.java.de.devch.sandbox.init.SandboxDatabaseCreateFromScratch;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class SandboxDatabaseCreateFromScratchTest.
 */
public class SandboxDatabaseCreateFromScratchTest {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		SandboxDatabaseCreateFromScratch sdbcreate = new SandboxDatabaseCreateFromScratch();
		assertEquals("Is correct", sdbcreate.drive(), 15);
	}
}
