package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_RESULTS_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String INPUT_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final String INPUT_FIND_PERSON_NAME = "결과를 보고 싶은 사람은?";

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputPeopleName() {
        System.out.println(INPUT_NAMES_MESSAGE);
        return scanner.nextLine();
    }

    public static String inputResults() {
        System.out.println(INPUT_RESULTS_MESSAGE);
        return scanner.nextLine();
    }

    public static String inputLadderHeight() {
        System.out.println(INPUT_LADDER_HEIGHT_MESSAGE);
        return scanner.nextLine();
    }

    public static String InputFindPersonName() {
        System.out.println(INPUT_FIND_PERSON_NAME);
        return scanner.nextLine();
    }
}
