package windseth.matthew.geoquiz;

/**
 * Created by Matt on 8/16/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int TextResId, boolean answerTrue) {
        mAnswerTrue = answerTrue;
        mTextResId = getTextResId();
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


}



