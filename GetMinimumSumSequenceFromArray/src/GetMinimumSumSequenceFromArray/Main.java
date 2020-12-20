package GetMinimumSumSequenceFromArray;

import MinimumSumSequence.IMinimumSumSequence;
import MinimumSumSequence.MinimumSumSequenceFactoryObject;

public class Main {

    public static void main(String[] args) {

        IMinimumSumSequence SequenceProcessor = MinimumSumSequenceFactoryObject.GetMinimumSumSequenceObject();

        assert SequenceProcessor.GetMinimumSumSequence(7, new int[] {5, -6, 3, 4, -2, 3, -3}) == 8;
    }
}
