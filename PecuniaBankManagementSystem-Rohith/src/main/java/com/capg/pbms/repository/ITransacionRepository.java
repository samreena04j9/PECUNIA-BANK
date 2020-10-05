package com.capg.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.entity.Transaction;

/*******************************************************************************************************************************
-Author                   :     N.Mani Kanta Reddy, M.Sai
-Created/Modified Date    :     22-09-2020
-Description              :     Transaction JpaRepository

*******************************************************************************************************************************/

public interface ITransacionRepository extends JpaRepository<Transaction, String> {

	
}
