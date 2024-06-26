package chap18_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import chap14_objectarray.car.Car;

public class _06_Iterator {

	/**
	 * Iterator는 해당 List의 인덱스를 직접 접근해 관리함
	 * List에서 요소 삭제되면 삭제된 요소 자리들을 앞에서부터 채워진다. ex)	1	2	3	4	5				1	2	3
	 * 													a	b	c	d	e		=>		a	b	e
	 * 															X   X 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car("현대", "제네시스", 5000, "검정"));
		carList.add(new Car("현대", "소나타", 4000, "흰색"));
		carList.add(new Car("기아", "k9", 5000, "검정"));
		carList.add(new Car("기아", "ev6", 6000, "초록"));
		carList.add(new Car("현대", "그랜저", 4500, "회색"));
		
		System.out.println("carList의 데이터 개수: " + carList.size());
		
		// 1. Iterator 객체 얻기
		Iterator<Car> carIterator = carList.iterator();
		
		while(carIterator.hasNext()) {
			Car car = carIterator.next();
			
			car.carInfo();
			
			// iterator를 통한 데이터 삭제
			// iterator.next 메소드로 데이터를 하나 꺼내온 후에 사용가능하다.
			if(car.company.equals("현대")) {
				// iterator.next 메소드를 통해 꺼내온 데이터 List에서 삭제
				carIterator.remove();
			}
		}
		// arrayList의 remove메소드로 삭제할 시 인덱스가 변경됨
		// 남아있는 것들 모두 앞에서부터 채워짐
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).company.equals("현대")) {
				carList.remove(carList.get(i--));
			}
		}
		for(Car car : carList) {
			if(car.company.equals("현대")) {
				carList.remove(carList.indexOf(car));
			}
		}
		System.out.println(carList.size());
		for(Car car : carList) {
			car.carInfo();
		}
		
		// 2. ListIterator 객체 얻기
		// cursor = 0 ListIterator 객체
		ListIterator<Car> carListIterator = carList.listIterator();
//		carList.add(new Car("현대", "소나타", 4000, "흰색"));
		
		// next메소드를 사용하면 iterator 객체가 다음 데이터를 가리키게 된다.
		// next => cursor + 1
		carListIterator.next();
		// cursor가 가리키고 있는 데이터 앞에 데이터를 추가한다.
		carListIterator.add(new Car("현대", "제네시스", 5000, "회색"));
		
		while(carListIterator.hasPrevious()) {
			// previous메소드는 iterator 객체가 이전 데이터를 가리키게 된다.
			carListIterator.previous();
			
			carListIterator.set(new Car("쉐보레", "카마로", 5000, "노란"));
		}
		
		System.out.println(carList.size());
		for(Car car : carList) {
			car.carInfo();
		}
	}

}
