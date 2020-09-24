package testing;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Charizard;

public class TestCharizard {
	@Test
	public void testCharacteristicsMethod() {
		Charizard p = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON", "240" );
		String temp = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		assertEquals(temp,p.getCharacteristics());		
		try {
			Charizard bulb = new Charizard(null,0,null,null,null,null);
			temp = null;
			bulb.getCharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Charizard p = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON", "240" );
		String temp = "FIRE";
		assertEquals(temp,p.getType());		
		try {
			Charizard p1 = new Charizard(null,0,null,null,null,null);
			temp = null;
			p1.getType();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Charizard charizard = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON", "240" );
		String temp = "CHARMELEON";
		assertEquals(temp,charizard.getEvolution());		
		try {
			Charizard p = new Charizard(null,0,null,null,null,null);
			temp = null;
			p.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testBaseExpMethod() {
		Charizard charizard = new Charizard("AAA",4,"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON", "240" );
		String temp = "240";
		assertEquals(temp,charizard.getBaseExp());		
		try {
			Charizard p = new Charizard(null,0,null,null,null,null);
			temp = null;
			p.getBaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
