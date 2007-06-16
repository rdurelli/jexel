package com.gadberry.utility.expression;

import com.gadberry.utility.expression.operator.AdditionOperatorTests;
import com.gadberry.utility.expression.operator.CeilOperatorTests;
import com.gadberry.utility.expression.operator.DivisionOperatorTests;
import com.gadberry.utility.expression.operator.FloorOperatorTests;
import com.gadberry.utility.expression.operator.MultiplicationOperatorTests;
import com.gadberry.utility.expression.operator.OperatorTests;
import com.gadberry.utility.expression.operator.SubtractionOperatorTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for com.gadberry.utility.expression");
		suite.addTestSuite(ArgumentTests.class);
		suite.addTestSuite(OperatorTests.class);
		suite.addTestSuite(AdditionOperatorTests.class);
		suite.addTestSuite(SubtractionOperatorTests.class);
		suite.addTestSuite(DivisionOperatorTests.class);
		suite.addTestSuite(MultiplicationOperatorTests.class);
		suite.addTestSuite(CeilOperatorTests.class);
		suite.addTestSuite(FloorOperatorTests.class);
		// suite.addTestSuite(ExpressionTests.class);
		return suite;
	}

}
