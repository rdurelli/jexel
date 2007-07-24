package com.gadberry.utility.expression.function;

import java.util.List;

import com.gadberry.utility.expression.Argument;
import com.gadberry.utility.expression.InvalidArgumentsException;
import com.gadberry.utility.expression.Resolver;

public class FloorFunction extends Function {

	protected void checkArgs(List<Argument> args)
			throws InvalidArgumentsException {
		if (args.size() != 1) {
			throw new InvalidArgumentsException(
					"FloorOperator requires a single double.  Wrong number of arguments provided.");
		}

		for (Argument arg : args) {
			if (!arg.isDouble()) {
				throw new InvalidArgumentsException(
						"MaxOperator only accepts a double.  Wrong type of arguments provided.  Arg: "
								+ arg.toString());
			}
		}
	}

	public Argument resolve(Resolver resolver) {
		double n = getArgument(0).toDouble();
		return new Argument(new Double(Math.floor(n)), resolver);
	}
}