package com.gadberry.utility.expression.operator;

import java.util.List;

import com.gadberry.utility.expression.Argument;
import com.gadberry.utility.expression.ArgumentCastException;
import com.gadberry.utility.expression.InvalidArgumentsException;
import com.gadberry.utility.expression.Resolver;

public class SinOperator extends Operator {

	protected void checkArgs(List<Argument> args)
			throws InvalidArgumentsException {
		if (args.size() != 1) {
			throw new InvalidArgumentsException(
					"SinOperator requires a single doubles.  Wrong number of arguments provided.");
		}

		for (Argument arg : args) {
			if (!arg.isDouble()) {
				throw new InvalidArgumentsException(
						"SinOperator only accepts doubles.  Wrong type of arguments provided.  Arg: "
								+ arg.toString());
			}
		}
	}

	public Argument resolve(Resolver resolver) {
		try {
			return new Argument(Math.sin(getArgument(0).toDouble()), resolver);
		} catch (ArgumentCastException e) {
		}
		return null;
	}

	public int getPriority() {
		return 20;
	}

	public String getType() {
		return Operator.FUNCTION;
	}
}
