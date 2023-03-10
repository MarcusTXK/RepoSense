package reposense.wizard;

/**
 * Represents a Prompt to get the view flag.
 */


public class OptionalPrompt extends Prompt {
    private final Prompt prompt;
    private final static String YES_FLAG = "Y";
    private final static String NO_FLAG = "N";
    private final static String DESCRIPTION = YES_FLAG + "/" + NO_FLAG;

    public OptionalPrompt(String question, Prompt prompt) {
        super(question, DESCRIPTION);
        this.prompt = prompt;
    }

    @Override
    public InputBuilder addToInput(InputBuilder inputBuilder) {
        return inputBuilder;
    }

    @Override
    public Prompt[] run() {
        if (getResponse().compareToIgnoreCase(YES_FLAG) == 0) {

        }

        return new Prompt[] {};
    }
}
