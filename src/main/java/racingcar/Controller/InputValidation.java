package racingcar.Controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/**
 * 클래스 이름 : InputValidation.java
 *
 * @author 보스독
 * @author 작은곰
 * @author 토니
 * @version 1.0
 * <p>
 * 날짜 : 2020.02.13 목요일
 */

public class InputValidation {
    public static void checkNullOrEmptyInput(String carName) {
        if (carName == null || carName.isEmpty()) {
            throw new NullPointerException("입력이 null 이나 빈 문자열입니다.");
        }
    }

    public static void checkEmptyCarName(String[] carNames) {
        for (String carName : carNames) {
            if (carName.isEmpty()) {
                throw new IllegalArgumentException("차 이름은 빈 문자열일 수 없습니다.");
            }
        }
    }

    public static void checkSmallerThanSix(String[] carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름의 길이가 6 이상입니다.");
            }
        }
    }

    public static void checkDuplicatedName(String[] carNames) {
        Set<String> set = new HashSet<>(Arrays.asList(carNames));
        if (set.size() < carNames.length) {
            throw new IllegalArgumentException("자동차 이름이 중복되었습니다.");
        }
    }

    public static void checkNegativeAndZeroInput(String trialTime) {
        double value = Double.parseDouble(trialTime);
        if (value <= 0) {
            throw new IllegalArgumentException("음수 또는 0을 입력할 수 없습니다.");
        }
    }

    public static void checkIntegerOverflow(String trialTime) {
        double value = Double.parseDouble(trialTime);
        if (value > Integer.MAX_VALUE) {
            throw new ArithmeticException("입력 범위를 초과했습니다.");
        }
    }

    public static void checkDecimalNumber(String trialTime) {
        if (trialTime.contains(".")) {
            throw new InputMismatchException("소수는 입력할 수 없습니다.");
        }
    }

    public static void checkNotNumber(String trialTime) {
        try {
            double value = Double.parseDouble(trialTime);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("문자는 입력할 수 없습니다.");
        }
    }

}
