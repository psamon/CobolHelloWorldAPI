/**
 * 
 */
package com.anz.CobolHelloWorldAPI.transform;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.anz.CobolHelloWorldAPI.transform.pojo.CustomerName;
import com.anz.CobolHelloWorldAPI.transform.pojo.PurchaseData;
import com.anz.CobolHelloWorldAPI.transform.pojo.PurchaseData.Invoice;
import com.anz.CobolHelloWorldAPI.transform.pojo.PurchaseData.Invoice.Item;
import com.anz.CobolHelloWorldAPI.transform.pojo.PurchaseData.Invoice.Item.ItemGrocery;
import com.anz.CobolHelloWorldAPI.transform.pojo.SampleCopybook;
import com.anz.CobolHelloWorldAPI.transform.pojo.SampleCopybook.Statement;
import com.anz.common.compute.ComputeInfo;
import com.anz.common.transform.ITransformer;
import com.anz.common.transform.TransformUtils;

/**
 * @author sanketsw
 * 
 */
public class HttpToCobolTransformer implements
		ITransformer<SampleCopybook, SampleCopybook> {
	
	private static final Logger logger = LogManager.getLogger();

	@Override
	public SampleCopybook execute(SampleCopybook input, Logger appLogger,
			ComputeInfo metadata) throws Exception {
		
		logger.info("Inside execute");
		
		SampleCopybook copybook = new SampleCopybook();
		Statement statement = new Statement();
		statement.setFirstWord("Hello");
		statement.setSecondWord(" World!");
		
		copybook.setStatement(statement);
		
		logger.info("copybook = {}", copybook);
		
		return copybook;
	}



}
