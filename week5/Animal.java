package week5;

public abstract class Animal {
	
	public String name;

		public String reaction(Animal animal) {
			
			//Animal cat = new Animal();
			
			String ani = null; //���� �ϴ� ����?
	
			if (animal instanceof Dog) {
				 ani = "������_�����ø��� ";
				 Dog dog = (Dog)animal;
				//System.out.println("������_�����ø���");
				//reaction = "������_�����ø���";
			}
			if  (animal instanceof Cat) {
				 ani = "�����_���������� ";
				 Cat cat = (Cat)animal;
				//System.out.println("�����_����������");
				//reaction = "�����_����������";
			}
			return ani;
			
			
		}

		public abstract void sound();

		

//	private static void animalSound(Dog dog) {
//			// TODO Auto-generated method stub	
//		}
//	
//	private static void animalSound(Cat cat) {
//		// TODO Auto-generated method stub	
//	}


//	public String reaction(Animal ani) {
//		//Animal ani = null;
//		
//		ani = new Dog();
//		ani = new Cat();
//		
//		//return null;
//		
//	}
		
//			Animal ani = null;
//			ani = new Dog();
//			ani = new Cat();

}
