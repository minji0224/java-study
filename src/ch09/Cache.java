package ch09;


// 임시저장소(조금 빠른 임시저장소)
// 일반 RDNMS는 응답성능이 10ms로 좀 느리지만,
// 캐시저장소는 응답성능이 1ms정도
public class Cache<T> {
    private T data;

    public T getData() {
        return this.data;
    }
    public void setData(T data) {
        this.data = data;
    }


}
