package javarushTests.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Selector {
	private static List<Owner> owners;

	public static void main(String[] args) {
		initData();
		
		final List<String> findNames = owners.stream()
				.flatMap(owner -> owner.getPets().stream())
				.filter(pet -> Cat.class.equals(pet.getClass()))
				.filter(cat -> Color.FOXY == cat.getColor())
				.sorted((o1, o2) -> o2.getAge() - o1.getAge())
				.map(Animal::getName)
				.collect(Collectors.toList());
//		= new ArrayList<>();
//		List<Cat> findCats = new ArrayList<>();
//		for(Owner owner : owners) {
//			for(Animal pet : owner.getPets()) {
//				if(Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) { 
//					findCats.add((Cat) pet);
//				}
//			}
//		}
//		Collections.sort(findCats, new Comparator<Cat>() {
//			public int compare(Cat o1, Cat o2) {
//				return o2.getAge() - o1.getAge();
//			}
//		});
//		for(Cat cat : findCats) {
//			findNames.add(cat.getName());
//		}
		findNames.forEach(System.out::println);
	}
	
	
	private static void initData() {
		final Owner owner1 = new Owner("Олежа");
		owner1.getPets().addAll(List.of(
				new Cat("Baron", Color.BLACK,3),
				new Cat("Sultan", Color.DARK_GREY, 4),
				new Dog("Elsa", Color.WHITE, 0)
				));
		
		final Owner owner2 = new Owner("Dimon");
		owner2.getPets().addAll(List.of(
				new Cat("Foxix", Color.FOXY, 7),
				new Cat("Barsic", Color.FOXY, 5),
				new Parrot("Admiral", Color.BLUE, 3)
				));
		
		final Owner owner3 = new Owner("Nataly");
		owner3.getPets().addAll(List.of(
				new Dog("Arnold", Color.FOXY, 3),
				new Pig("Pelic", Color.LIGHT_GREY, 8)
				));
		
		final Owner owner4 = new Owner("Pavlic");
		owner4.getPets().addAll(List.of(
				new Snake("Udav", Color.DARK_GREY, 2)				
				));
		
		final Owner owner5 = new Owner("Anton");
		owner1.getPets().addAll(List.of(
				new Cat("Fisher", Color.BLACK, 16),
				new Cat("Zorro", Color.FOXY, 14),
				new Cat("Margo", Color.WHITE,3),
				new Cat("Zabix", Color.DARK_GREY, 1)
				));
		owners = List.of(owner1, owner2, owner3, owner4, owner5);
	}

}
