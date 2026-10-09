package com.example.rag.service;

import com.example.rag.model.Conversation;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ConversationRepository extends JpaRepository<Conversation, String> { 
	 List<Conversation> findByUserIdOrderByUpdatedAtDesc(String userId);
	    Optional<Conversation> findByUserIdAndId(String userId, String id);
}


