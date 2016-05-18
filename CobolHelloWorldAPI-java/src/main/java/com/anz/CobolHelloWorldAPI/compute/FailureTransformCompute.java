/**
 * 
 */
package com.anz.CobolHelloWorldAPI.compute;

import com.anz.CobolHelloWorldAPI.error.TransformFailureResponse;

import com.anz.common.compute.ComputeInfo;
import com.anz.common.compute.TransformType;
import com.anz.common.compute.impl.CommonErrorTransformCompute;
import com.anz.common.transform.ITransformer;
import com.ibm.broker.plugin.MbMessageAssembly;

/**
 * @author root
 *
 */
public class FailureTransformCompute extends CommonErrorTransformCompute {

	@Override
	public ITransformer<MbMessageAssembly, String> getTransformer() {
		return new TransformFailureResponse();
	}

	@Override
	public TransformType getTransformationType() {
		// TODO Auto-generated method stub
		return TransformType.HTTP_MQ;
	}

	@Override
	public void prepareForTransformation(ComputeInfo metadata,
			MbMessageAssembly inAssembly, MbMessageAssembly outAssembly) {
		// TODO Auto-generated method stub
		
	}

}
