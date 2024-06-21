package telran.java52.pulse.dto;

import lombok.Getter;

@Getter
public class PulseDto {
	int id;
	long timestamp;
	int payload;
	
	@Override
	public String toString() {
		return "PulseDto [id=" + id + ", timestamp=" + timestamp + ", payload=" + payload + "]";
	}
	
	
}
