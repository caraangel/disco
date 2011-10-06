/*
 *   Copyright 2011 Calytrix Technologies
 *
 *   This file is part of Calytrix Disco.
 *
 *   Calytrix Disco is free software; you can redistribute it and/or modify
 *   it under the terms of the Common Developer and Distribution License (CDDL) 
 *   as published by Sun Microsystems. For more information see the LICENSE file.
 *   
 *   Use of this software is strictly AT YOUR OWN RISK!!!
 *   If something bad happens you do not have permission to come crying to me.
 *   (that goes for your lawyer as well)
 *
 */
package com.calytrix.disco.pdu.field;

/**
 * This field shall specify the result of the detonation. This field shall be represented by an
 * 8-bit enumeration.
 * 
 * @see "Section 5 in EBV-DOC"
 */
public class DetonationResult
{
	//----------------------------------------------------------
	//                    STATIC VARIABLES
	//----------------------------------------------------------
	public static final int OTHER = 0;
	public static final int ENTITY_IMPACT = 1;
	public static final int ARMORPIERCING_HIT = 10;
	public static final int DIRT_BLAST_SMALL = 11;
	public static final int DIRT_BLAST_MEDIUM = 12;
	public static final int DIRT_BLAST_LARGE = 13;
	public static final int WATER_BLAST_SMALL = 14;
	public static final int WATER_BLAST_MEDIUM = 15;
	public static final int WATER_BLAST_LARGE = 16;
	public static final int AIR_HIT = 17;
	public static final int BUILDING_HIT_SMALL = 18;
	public static final int BUILDING_HIT_MEDIUM = 19;
	public static final int ENTITY_PROXIMATE_DETONATION = 2;
	public static final int BUILDING_HIT_LARGE = 20;
	public static final int MINECLEARING_LINE_CHARGE = 21;
	public static final int ENVIRONMENT_OBJECT_IMPACT = 22;
	public static final int ENVIRONMENT_OBJECT_PROXIMATE_DETONATION = 23;
	public static final int WATER_IMPACT = 24;
	public static final int AIR_BURST = 25;
	public static final int GROUND_IMPACT = 3;
	public static final int GROUND_PROXIMATE_DETONATION = 4;
	public static final int DETONATION = 5;
	public static final int NONE = 6;
	public static final int HE_HIT_SMALL = 7;
	public static final int HE_HIT_MEDIUM = 8;
	public static final int HE_HIT_LARGE = 9;

	//----------------------------------------------------------
	//                   INSTANCE VARIABLES
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                      CONSTRUCTORS
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                    INSTANCE METHODS
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                     STATIC METHODS
	//----------------------------------------------------------
	/**
	 * Returns the ordered set of values that this enumerated field can assume
	 * 
	 * @return An int[] containing the ordered set of values that this 
	 * enumeration field can assume
	 */
	public static int[] getValues()
	{
		int[] values =
		    { OTHER, ENTITY_IMPACT, ARMORPIERCING_HIT, DIRT_BLAST_SMALL, DIRT_BLAST_MEDIUM,
		     DIRT_BLAST_LARGE, WATER_BLAST_SMALL, WATER_BLAST_MEDIUM, WATER_BLAST_LARGE, AIR_HIT,
		     BUILDING_HIT_SMALL, BUILDING_HIT_MEDIUM, ENTITY_PROXIMATE_DETONATION,
		     BUILDING_HIT_LARGE, MINECLEARING_LINE_CHARGE, ENVIRONMENT_OBJECT_IMPACT,
		     ENVIRONMENT_OBJECT_PROXIMATE_DETONATION, WATER_IMPACT, AIR_BURST, GROUND_IMPACT,
		     GROUND_PROXIMATE_DETONATION, DETONATION, NONE, HE_HIT_SMALL, HE_HIT_MEDIUM,
		     HE_HIT_LARGE };
		return values;
	}
	
	/**
	 * Returns a textual description of the provided field value
	 * 
	 * @param value The field value to return a description of
	 * 
	 * @return A String representing the description of the specified field
	 * value
	 */
	public static String getDescription( int value )
	{
		String description = "HE_hit_large";
		switch( value )
		{
			case HE_HIT_MEDIUM:
				description = "HE hit, medium";
				break;

			case HE_HIT_SMALL:
				description = "HE hit, small";
				break;

			case NONE:
				description = "None";
				break;

			case DETONATION:
				description = "Detonation";
				break;

			case GROUND_PROXIMATE_DETONATION:
				description = "Ground Proximate Detonation";
				break;

			case GROUND_IMPACT:
				description = "Ground Impact";
				break;

			case AIR_BURST:
				description = "Air Burst";
				break;

			case WATER_IMPACT:
				description = "Water Impact";
				break;

			case ENVIRONMENT_OBJECT_PROXIMATE_DETONATION:
				description = "Environment object proximate detonation";
				break;

			case ENVIRONMENT_OBJECT_IMPACT:
				description = "Environment object impact";
				break;

			case MINECLEARING_LINE_CHARGE:
				description = "Mine-clearing line charge";
				break;

			case BUILDING_HIT_LARGE:
				description = "Building hit, large";
				break;

			case ENTITY_PROXIMATE_DETONATION:
				description = "Entity Proximate Detonation";
				break;

			case BUILDING_HIT_MEDIUM:
				description = "Building hit, medium";
				break;

			case BUILDING_HIT_SMALL:
				description = "Building hit, small";
				break;

			case AIR_HIT:
				description = "Air hit";
				break;

			case WATER_BLAST_LARGE:
				description = "Water blast, large";
				break;

			case WATER_BLAST_MEDIUM:
				description = "Water blast, medium";
				break;

			case WATER_BLAST_SMALL:
				description = "Water blast, small";
				break;

			case DIRT_BLAST_LARGE:
				description = "Dirt blast, large";
				break;

			case DIRT_BLAST_MEDIUM:
				description = "Dirt blast, medium";
				break;

			case DIRT_BLAST_SMALL:
				description = "Dirt blast, small";
				break;

			case ARMORPIERCING_HIT:
				description = "Armor-piercing hit";
				break;

			case ENTITY_IMPACT:
				description = "Entity Impact";
				break;

			case OTHER:
				description = "Other";
				break;
		}

		return description;
	}

}