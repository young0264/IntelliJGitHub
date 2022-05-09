package 혼공자2복습.exam06;

public class Button {
    OnClickListener listener;

    void setListener(OnClickListener listner){
        this.listener = listner;
    }

    void click(){
        //구체적인실행내용을 넣어선 안돼? ㅅㅂ
    }

    static interface OnClickListener{
        void onClick();
    }
}
