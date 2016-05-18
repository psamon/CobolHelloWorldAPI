package com.anz.CobolHelloWorldAPI.compute;

import com.anz.CobolHelloWorldAPI.transform.HttpToCobolTransformer;
import com.anz.CobolHelloWorldAPI.transform.pojo.CustomerName;
import com.anz.CobolHelloWorldAPI.transform.pojo.PurchaseData;
import com.anz.CobolHelloWorldAPI.transform.pojo.SampleCopybook;
import com.anz.common.compute.ComputeInfo;
import com.anz.common.compute.IParser;
import com.anz.common.compute.TransformType;
import com.anz.common.compute.impl.CustomParserTransformCompute;
import com.anz.common.compute.impl.JaxbDFDLParser;
import com.anz.common.compute.impl.JsonBlobParser;
import com.anz.common.transform.ITransformer;
import com.ibm.broker.plugin.MbMessageAssembly;

public class HttpToCobolTransformCompute extends CustomParserTransformCompute<SampleCopybook, SampleCopybook> {

	@Override
	public TransformType getTransformationType() {
		return TransformType.HTTP_MQ;
	}

	@Override
	public IParser<SampleCopybook> getInputParser() {
		return new JsonBlobParser<>(SampleCopybook.class);
	}

	@Override
	public IParser<SampleCopybook> getOutputParser() {
		return new JaxbDFDLParser<>(SampleCopybook.class);
	}

	@Override
	public ITransformer<SampleCopybook, SampleCopybook> getTransformer() {
		return new HttpToCobolTransformer();
	}

	@Override
	public void prepareForTransformation(ComputeInfo metadata,
			MbMessageAssembly inAssembly, MbMessageAssembly outAssembly) {
		// Auto-generated method stub
		
	}
	

}
