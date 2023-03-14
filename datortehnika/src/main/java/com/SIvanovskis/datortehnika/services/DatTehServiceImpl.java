package com.SIvanovskis.datortehnika.services;

import com.SIvanovskis.datortehnika.entity.DatTehEntity;
import com.SIvanovskis.datortehnika.model.DatTeh;
import com.SIvanovskis.datortehnika.repository.DatTehRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DatTehServiceImpl implements DatTehService{

    private DatTehRepository datTehRepository;

    public DatTehServiceImpl(DatTehRepository datTehRepository){

        this.datTehRepository = datTehRepository;
    }
    @Override
    public DatTeh createDatTeh(DatTeh datTeh){
        DatTehEntity datTehEntity = new DatTehEntity();

        BeanUtils.copyProperties(datTeh, datTehEntity);
        datTehRepository.save(datTehEntity);
        return datTeh;
    }
}
