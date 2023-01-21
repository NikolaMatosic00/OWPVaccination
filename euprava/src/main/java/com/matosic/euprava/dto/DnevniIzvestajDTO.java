package com.matosic.euprava.dto;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DnevniIzvestajDTO {

	private int brojObolelihUPoslednjemDanu;

	private int brojTestiranihUPoslednjemDanu;

	@Nullable
	private int brojObolelihOdPocetkaPandemije;

	private int brojHospitalizovanih;

	private int brojNaRespiratorima;

	@Nullable
	private String datumVremeObjavljivanja;

}
