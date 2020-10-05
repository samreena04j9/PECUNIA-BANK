package com.capg.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.pbms.entity.Cheque;

/*******************************************************************************************************************************
-Author                   :     N.Mani Kanta Reddy
-Created/Modified Date    :     22-09-2020
-Description              :     Cheque JpaRepository 

*******************************************************************************************************************************/
public interface IChequeRepository extends JpaRepository<Cheque, String>{

	
}
