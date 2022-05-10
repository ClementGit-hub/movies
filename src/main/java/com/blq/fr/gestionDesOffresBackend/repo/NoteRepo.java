package com.blq.fr.gestionDesOffresBackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blq.fr.gestionDesOffresBackend.model.Note;

public interface NoteRepo extends JpaRepository<Note, Long> {

		void deleteNoteById(Long id);
		
		Optional<Note> findNoteById(Long id);
}
