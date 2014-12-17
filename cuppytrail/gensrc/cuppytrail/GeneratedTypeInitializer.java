

package cuppytrail;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"Stadium",
			"GenericItem",
			com.cuppytrail.jalo.Stadium.class,
			"de.hybris.platform.persistence.cuppytrail_Stadium",
			false,
			null,
			false
		);
	
		createRelationType(
			"StadiumMatchRelation",
			null,
			true
		);
	
		createEnumerationType(
			"StadiumType",
			null
		);
	
		createEnumerationType(
			"StadiumAccess",
			null
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_Stadium_code();
			
				single_createattr_Stadium_capacity();
			
				single_createattr_Stadium_stadiumType();
			
		createRelationAttributes(
			"StadiumMatchRelation", 
			false, 

			"stadium", 
			"Stadium", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			false,
			false,
			CollectionType.COLLECTION,
			"matches", 
			"Match", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION
		);
	

	}

	
	public void single_createattr_Stadium_code() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"code",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stadium_capacity() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"capacity",  
					null,
					"java.lang.Integer",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stadium_stadiumType() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"stadiumType",  
					null,
					"StadiumType",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
		createEnumerationValues(
			"StadiumType",
			false,
			Arrays.asList( new String[] {
			
				"openair",
				"enclosed"
			} )
		);
	
		createEnumerationValues(
			"StadiumAccess",
			true,
			Arrays.asList( new String[] {
			
				"road",
				"rail",
				"plane"
			} )
		);
	
		single_setRelAttributeProperties_StadiumMatchRelation_source();
	
		single_setRelAttributeProperties_StadiumMatchRelation_target();
	
		connectRelation(
			"StadiumMatchRelation", 
			false, 
			"stadium", 
			"Stadium", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"matches", 
			"Match", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"Stadium",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_Stadium_code();
		
			single_setAttributeProperties_Stadium_capacity();
		
			single_setAttributeProperties_Stadium_stadiumType();
		
				setDefaultProperties(
					"StadiumType",
					true,
					true,
					null
				);
			
				setDefaultProperties(
					"StadiumAccess",
					true,
					true,
					null
				);
			
	}


		
						public void single_setAttributeProperties_Stadium_code() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"code",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stadium_capacity() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"capacity",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stadium_stadiumType() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"stadiumType",
								false, 
								em().getEnumerationValue("StadiumType","openair"),
								"em().getEnumerationValue(\"StadiumType\",\"openair\")",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
								public void single_setRelAttributeProperties_StadiumMatchRelation_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Match", 
										"stadium",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_StadiumMatchRelation_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Stadium", 
										"matches",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
}

	