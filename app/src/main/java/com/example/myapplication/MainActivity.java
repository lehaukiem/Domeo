package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvQuestion;
    private TextView tvContentQuestion;
    private TextView tvAnswer1,tvAnswer2,tvAnswer3,tvAnswer4;

    private List<Question> mListQuestion;
    private Question mQuestion;
    private int currentQuestion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        widget();
        mListQuestion = getListQuestion();
        if (mListQuestion.isEmpty()){
            return;
        }
        setDataQuestion(mListQuestion.get(currentQuestion));
    }

    private void setDataQuestion(Question question) {
        if (question == null){
            return;
        }

        mQuestion = question;

        tvAnswer1.setBackgroundResource(R.drawable.bg_blue_corner_30);
        tvAnswer2.setBackgroundResource(R.drawable.bg_blue_corner_30);
        tvAnswer3.setBackgroundResource(R.drawable.bg_blue_corner_30);
        tvAnswer4.setBackgroundResource(R.drawable.bg_blue_corner_30);

        String tittlQuestion = "Câu " + question.getNumber();
        String tleQuestion = question.getContent();
        tvQuestion.setText(tittlQuestion);
        tvContentQuestion.setText(tleQuestion);
        tvAnswer1.setText(question.getListAnswer().get(0).getContent());
        tvAnswer2.setText(question.getListAnswer().get(1).getContent());
        tvAnswer3.setText(question.getListAnswer().get(2).getContent());
        tvAnswer4.setText(question.getListAnswer().get(3).getContent());

        tvAnswer1.setOnClickListener(this);
        tvAnswer2.setOnClickListener(this);
        tvAnswer3.setOnClickListener(this);
        tvAnswer4.setOnClickListener(this);


    }

    private void widget() {
        tvQuestion = (TextView) findViewById(R.id.tv_question);
        tvContentQuestion = (TextView) findViewById(R.id.tv_content_question);
        tvAnswer1 = (TextView) findViewById(R.id.tv_answer1);
        tvAnswer2 = (TextView) findViewById(R.id.tv_answer2);
        tvAnswer3 = (TextView) findViewById(R.id.tv_answer3);
        tvAnswer4 = (TextView) findViewById(R.id.tv_answer4);

    }
    private List<Question> getListQuestion(){
        List<Question> list = new ArrayList<>();

        List<Answer> answerList1 = new ArrayList<>();
        answerList1.add(new Answer("Đau Bụng",false));
        answerList1.add(new Answer("Đau Mắt Đỏ",false));
        answerList1.add(new Answer("Cúm",false));
        answerList1.add(new Answer("Gãy Tay",true));

        List<Answer> answerList2 = new ArrayList<>();
        answerList2.add(new Answer("Lịch Vạn Niên",false));
        answerList2.add(new Answer("Lịch Sử",true));
        answerList2.add(new Answer("Lịch treo tường",false));
        answerList2.add(new Answer("Lịch Bàn",false));

        List<Answer> answerList3 = new ArrayList<>();
        answerList3.add(new Answer("Cái Cổ",false));
        answerList3.add(new Answer("Bàn Chân",true));
        answerList3.add(new Answer("Bàn Tay",false));
        answerList3.add(new Answer("Cái Lưng",false));

        List<Answer> answerList4 = new ArrayList<>();
        answerList4.add(new Answer("Cái thuyền",false));
        answerList4.add(new Answer("Cái Vung",false));
        answerList4.add(new Answer("Bóng Mặt Trăng",true));
        answerList4.add(new Answer("Cây Cầu",false));

        List<Answer> answerList5 = new ArrayList<>();
        answerList5.add(new Answer("Cây mía",false));
        answerList5.add(new Answer("Xúc xích",false));
        answerList5.add(new Answer("Bắp Ngô",true));
        answerList5.add(new Answer("Củ khoai",false));

        List<Answer> answerList6 = new ArrayList<>();
        answerList6.add(new Answer("3",false));
        answerList6.add(new Answer("4",false));
        answerList6.add(new Answer("1",false));
        answerList6.add(new Answer("2",true));

        List<Answer> answerList7 = new ArrayList<>();
        answerList7.add(new Answer("Khoe sắc thắm",true));
        answerList7.add(new Answer("dưới ánh nắng",false));
        answerList7.add(new Answer("triệu cành hồng",false));
        answerList7.add(new Answer("sương long lanh",false));

        List<Answer> answerList8 = new ArrayList<>();
        answerList8.add(new Answer("Bánh đậu xanh",false));
        answerList8.add(new Answer("Bánh Chưng",true));
        answerList8.add(new Answer("Bánh Cáy",false));
        answerList8.add(new Answer("Bánh mì",false));

        List<Answer> answerList9 = new ArrayList<>();
        answerList9.add(new Answer("Đôi chân",false));
        answerList9.add(new Answer("Môi trường sống",true));
        answerList9.add(new Answer("Cái tay",false));
        answerList9.add(new Answer("Cái đầu",false));

        List<Answer> answerList10 = new ArrayList<>();
        answerList10.add(new Answer("Thủy siêu cấp víp pro",false));
        answerList10.add(new Answer("Thủy xinh gái",true));
        answerList10.add(new Answer("Thủy hiền lành nết na",false));
        answerList10.add(new Answer("Thủy đa nhân cách",false));

        list.add(new Question(1,"Bệnh gì bác sỹ bó tay?",answerList1));
        list.add(new Question(2,"Lịch gì dài nhất?",answerList2));
        list.add(new Question(3,"Cái gì mà đi thì nằm, đứng cũng nằm, nhưng nằm thì lại đứng?",answerList3));
        list.add(new Question(4,"Vừa bằng cái vung mà vùng xuống ao, đào không thấy, lấy không được?",answerList4));
        list.add(new Question(5,"Bỏ ngoài nướng trong, ăn ngoài bỏ trong",answerList5));
        list.add(new Question(6,"Trong 1 cuộc thi chạy, nếu bạn bượt qua người thứ 2 bạn sẽ đứng thứ mấy?",answerList6));
        list.add(new Question(7,"Tìm điểm sai trong câu:'...dưới ánh nắng long lanh triệu cành hồng khoe săc thắm'",answerList7));
        list.add(new Question(8,"Cái gì trong trắng ngoài xanh. Trồng đậu, trồng hành rồi thả heo vào",answerList8));
        list.add(new Question(9,"Con trai và con chim khác nhau chủ yếu ở điểm nào?",answerList9));
        list.add(new Question(10,"Chọn đáp án bạn cho là đúng nhất?",answerList10));


        return list;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_answer1:
                tvAnswer1.setBackgroundResource(R.drawable.bg_orange_corner_30);
                checkAnswer(tvAnswer1,mQuestion,mQuestion.getListAnswer().get(0));
                break;

            case R.id.tv_answer2:
                tvAnswer2.setBackgroundResource(R.drawable.bg_orange_corner_30);
                checkAnswer(tvAnswer2,mQuestion,mQuestion.getListAnswer().get(1));
                break;

            case R.id.tv_answer3:
                tvAnswer3.setBackgroundResource(R.drawable.bg_orange_corner_30);
                checkAnswer(tvAnswer3,mQuestion,mQuestion.getListAnswer().get(2));
                break;

            case R.id.tv_answer4:
                tvAnswer4.setBackgroundResource(R.drawable.bg_orange_corner_30);
                checkAnswer(tvAnswer4,mQuestion,mQuestion.getListAnswer().get(3));
                break;
        }
    }
    private void checkAnswer(final TextView textView, final Question question, final Answer answer){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(answer.isCorrect()){
                    textView.setBackgroundResource(R.drawable.bg_green_corner_10);
                    nextQuestion();
                }else {
                    textView.setBackgroundResource(R.drawable.bg_red_corner_10);
                    showAnswerCorrect(question);
                    gmaeOver();
                }
            }
        },1000);
    }

    private void gmaeOver() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showDialog("Thua rồi! Làm lại bạn nhé!!!");
            }
        },1000);
    }

    private void showAnswerCorrect(Question question) {
        if (question == null || question.getListAnswer() == null || question.getListAnswer().isEmpty()) {
            return;
        }

        if (question.getListAnswer().get(0).isCorrect()) {
            tvAnswer1.setBackgroundResource(R.drawable.bg_green_corner_10);
        } else if (question.getListAnswer().get(1).isCorrect()) {
            tvAnswer2.setBackgroundResource(R.drawable.bg_green_corner_10);
        } else if (question.getListAnswer().get(2).isCorrect()) {
            tvAnswer3.setBackgroundResource(R.drawable.bg_green_corner_10);
        } else if (question.getListAnswer().get(3).isCorrect()){
            tvAnswer4.setBackgroundResource(R.drawable.bg_green_corner_10);
        }

    }


    private void nextQuestion() {
        if (currentQuestion == mListQuestion.size() - 1){
            showDialog("Bạn đã chiến thắng rồi nè! Bạn giỏi quá!!!");
        }else {
            currentQuestion++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setDataQuestion(mListQuestion.get(currentQuestion));
                }
            },1000);
        }
    }


    private void showDialog(String mess){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(mess);
        builder.setCancelable(false);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                currentQuestion = 0;
                setDataQuestion(mListQuestion.get(currentQuestion));
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void exit(View view) {
        finish();
    }
}