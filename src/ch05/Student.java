package ch05;
// set : 설정, 저장한다.
// method : 기능 = 함수
// 클래스는 찍어내는 틀, 뭘 찍는지의 정보를 저장하고 기능을 쓸 수 있는 객체(object)를 생성할 때
// get 가져오다 get.가져와라
// value 값, 가치 val
//
public class Student {

    private String name;

    private int grade;



//    public Student(String setName, int setGrade, int studentAge) {
//        this.setName = setName;
//        this.setGrade = setGrade;
//        this.studentAge = studentAge;
//    }
//
//    public void printStudentInfo() {
//        System.out.println("학생의 이름은 " + setName);
//        System.out.println("학생의 학년은 " + setGrade);
//        System.out.println("학생의 나이는 " + studentAge);
//    }




    // 매서드: 기능(function)
    // 찍어낸 틀에 어떤 기능을 넣을 건지
    // 학생 이름(name)을 저장하는 기능
    // CRUD(create read update delete)
    // 매서드는 무조건 public 넣기

    /*
    매서드 선언할 때 순서
    1. public 쓴다(99.99%)
    2. 요구사항에 맞게 매서드(기능)이름을 쓰기(camel-case)
    3. 입력값을 받냐/ 안받냐
       * 입력값을 받을 때 : 매개변수 선언  > 매개변수의 이름부터 만들기 > 매개변수의 자료형(타입)
    4. 구현(implementation)할 코드를 작성
    5. 반환값이 있나?(처리하고 내보낼 것인지) : 매서드를 실행(호출)하고 나서 튀어나오는 값이 있나?
       반환이 없으면 > 탄환 탑입을 메서드명 앞에 적어줌(void)

     */

    public void setName(String name){
        this.name = name;
        // 객체 필드에 저장(this name)
        // name은 매개변수의 name
    }
    // 이 매서드의 기능은 학생이름을 입력받고 저장하는 것
    // 매개변수(parameter)를 지정
    // 매개 변수를 통해 학생이름을 지정
    // 객체 필드에 저장(this name)
    // 어디다 저장할 것이냐 : Class에 만든 데이터
    // 반환값의 타입: void
    // 반환값이 없기 때문에 void를 씀(리턴할 필요 없어서)
    // 반환값은 void or String (반환값은 원래 나중에 넣는데, 자바만 이럼)


    // 학생 정보의 이름을 가져오는(get) 메서드(출력X)
    // 학생이름을 필드에 넣었으니 필드에서 빼오기(필드값 반환)
    // 이번에는 반환값이 있음. 반환값의 자료형은 String
    public String getName() {
        return this.name;
    }














    }


