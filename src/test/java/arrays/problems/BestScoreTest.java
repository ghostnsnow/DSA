package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestScoreTest {

    BestScore bestScore;

    @BeforeEach
    void setUp() {

        bestScore = new BestScore();
    }

    @Test
    void findTopTwoScoresWithDuplicate() {

        int[] inputArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0,90};
        int[] actual = bestScore.findTopTwoScores(inputArray);
        int[] expected = {90, 90};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findTopTwoScoresWithoutDuplicate() {

        int[] inputArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] actual = bestScore.findTopTwoScores(inputArray);
        int[] expected = {90, 87};

        Assertions.assertArrayEquals(expected, actual);
    }
}