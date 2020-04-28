package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.GuideDTO;
import it.contrader.model.Guide;

public class GuideConverter   {
	

	public GuideDTO toDTO(Guide guide) {
		GuideDTO guideDTO = new GuideDTO(guide.getIdGuide(), guide.getQuestion(), guide.getAnswer());
		return guideDTO;
	}


	public Guide toEntity(GuideDTO guideDTO) {
		Guide guide = new Guide (guideDTO.getIdGuide(), guideDTO.getQuestion(), guideDTO.getAnswer());
		return guide;
	}
	
	
	public List<GuideDTO> toDTOList(List<Guide> guideList) {
		//Crea una lista vuota.
		List<GuideDTO> guideDTOList = new ArrayList<GuideDTO>();
		
		//Cicla tutti gli elementi della lista e li converte uno a uno
		for(Guide guide : guideList) {
			//Utilizza il metodo toDTO per convertire ogni singolo elemento della lista
			//e lo aggiunge adda lista di DTO
			guideDTOList.add(toDTO(guide));
		}
		return guideDTOList;
	}
}

