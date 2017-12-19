package com.ESEO_TP_Maven2;

import org.junit.Test;

import com.Addition;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	
	@Test
	public void additionAvecDeuxNombres(){
		final long lAddition= Addition.calculer(10,20);
		Assert.assertEquals(30,  lAddition);
	}

}
