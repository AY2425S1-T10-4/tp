package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Greets the user.
 */
public class GreetCommand extends Command {
    public static final String COMMAND_WORD = "greet";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Greets user.\n"
            + "Example: " + COMMAND_WORD;

    public static final String GREET_MESSAGE = "Hello!";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return new CommandResult(GREET_MESSAGE, false, false);
    }
}
