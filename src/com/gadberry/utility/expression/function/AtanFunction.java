package com.gadberry.utility.expression.function;

import java.util.List;

import com.gadberry.utility.expression.Argument;
import com.gadberry.utility.expression.InvalidArgumentsException;

public class AtanFunction extends Function {

	@Override
	protected void checkArgs(List<Argument> args) throws InvalidArgumentsException {
		if (args.size() != 1) {
			throw new InvalidArgumentsException(
					"AtanOperator requires a single doubles.  Wrong number of arguments provided.");
		}

		for (Argument arg : args) {
			if (!arg.isDouble()) {
				throw new InvalidArgumentsException(
						"AtanOperator only accepts doubles.  Wrong type of arguments provided.  Arg: " + arg.toString());
			}
		}
	}

	@Override
	public Argument resolve() {
		return new Argument(Math.atan((getArgument(0).toDouble())), resolver);
	}
}
