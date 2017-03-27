
public class Database {
	public DTO[] getDB(){
DTO[] array = new DTO[4];
DTO dto = new DTO();
dto.setPassword("1234");
dto.setUserName("Aazam");
array[0] = dto;
dto = new DTO();
dto.setUserName("Mohd");
dto.setPassword("123456");
array[1] = dto;
dto = new DTO();
dto.setUserName("Mohd");
dto.setPassword("1234567");
array[2] = dto;
dto = new DTO();
dto.setPassword("P@ssw0rd");
dto.setUserName("Anurudh");
array[3] = dto;							
return array;
	}
}
