package com.capg.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.pbms.entity.Slip;

/*******************************************************************************************************************************
-Author                   :     M.Sai
-Created/Modified Date    :     22-09-2020
-Description              :     Slip JpaRepository

*******************************************************************************************************************************/
public interface ISlipRepository extends JpaRepository<Slip, String> {


	
}
