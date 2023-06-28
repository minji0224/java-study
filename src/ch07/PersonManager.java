package ch07;

public class PersonManager {

    public void  work(Person p) {
            if(p instanceof Student) {
                ((Student) p).study();   //((Student) this) 디스를 스튜던트로 형변환 했다는 말
            } else if (p instanceof Lecturer) {
                ((Lecturer) p).teach();
            }
        }
    }

