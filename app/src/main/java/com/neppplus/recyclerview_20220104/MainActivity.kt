package com.neppplus.recyclerview_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.neppplus.recyclerview_20220104.adapters.StudentAdapter
import com.neppplus.recyclerview_20220104.models.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    여러 학생을 담아줄 그릇으로 사용할 변수 생성.
    val mStudentList = ArrayList<Student>()

//    학생데이터들을 -> 리싸이클러뷰에 뿌려주는 어댑터 변수 생성.
//    어댑터 : 어느화면? 정보 넣어야함. => onCreate에서 대입해야함.
//    변수는 미리 -> 대입은 나중에 (lateinit)
    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        임시방편 : 코드에 직접 타이핑해서 학생 목록 추가

        mStudentList.add( Student("조경진", 1988, "서울시 동대문구") )
        mStudentList.add( Student("김범준", 1995, "서울시 송파구") )
        mStudentList.add( Student("김현희", 1995, "서울시 성북구") )
        mStudentList.add( Student("이승훈", 1994, "서울시 구로구") )
        mStudentList.add( Student("전은형", 1991, "서울시 중랑구") )

//        화면이 완성되고 난 후에, 어댑터 객체 대입.
        mAdapter = StudentAdapter(this, mStudentList)

//        리싸이클러뷰의 어댑터로써 -> mAdapter가 동작하도록 세팅.
        studentRecyclerView.adapter = mAdapter

//        일렬로 줄세운 모양으로 표시.
        studentRecyclerView.layoutManager = LinearLayoutManager(this)


    }
}