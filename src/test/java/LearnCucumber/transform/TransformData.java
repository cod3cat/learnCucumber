package LearnCucumber.transform;

import cucumber.api.Transformer;

public class TransformData extends Transformer<String>{

	@Override
	public String transform(String value) {
		
		return value + " Transformed";
	}

}
