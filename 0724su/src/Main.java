import java.util.ArrayList;
import java.util.Comparator;




public class Main {


	public static void main(String[] args) {
		
		ArrayList<DTO> list = new ArrayList<>();
		
		DTO dto = new DTO();
		dto.setNum(13);
		dto.setName("dff");
		dto.setJumsu(50);
		dto.setO(date);
		
		DTO dto1 = new DTO();
		dto1.setNum(15);
		dto1.setName("asdfsdf");
		dto1.setJumsu(40);
	
		DTO dto2 = new DTO();
		dto2.setNum(14);
		dto2.setName("adfasdf");
		dto2.setJumsu(20);
	
		DTO dto3 = new DTO();
		dto3.setNum(16);
		dto3.setName("sfgdff");
		dto3.setJumsu(10);
		
		DTO dto4 = new DTO();
		dto4.setNum(13);
		dto4.setName("dff");
		dto4.setJumsu(70);
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		
		Comparator<DTO> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				DTO first = (DTO)o1;
				DTO second = (DTO)o2;
				return first.getJumsu() - second.getJumsu();
				
				
			}
			
		};
		list.sort(comp);
		
		for(DTO temp : list) {
			System.out.println(temp);
		}
		
		
	}

}
