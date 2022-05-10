package com.blq.fr.gestionDesOffresBackend.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blq.fr.gestionDesOffresBackend.exception.UserNotFoundException;
import com.blq.fr.gestionDesOffresBackend.model.Note;
import com.blq.fr.gestionDesOffresBackend.repo.NoteRepo;

@Service
@Transactional
public class NoteService {
	
	private final NoteRepo noteRepo;

	@Autowired
	public NoteService(NoteRepo noteRepo) {
		this.noteRepo = noteRepo;
	}
	
//	public Partenaire addPartenaire(Partenaire partenaire) { 
//		
//		partenaire.setPartenaireCode(UUID.randomUUID().toString());
//		
//		return partenaireRepo.save(partenaire);
//	}
	
	public List<Note> findAllNotes() {
		
		System.out.println(noteRepo.findAll());
		
		return noteRepo.findAll();
	}
	
	public Note updateNote(Note note) {
		
		return noteRepo.save(note);
	}
	
	public Note findNoteById(Long id) {
		
		return noteRepo.findNoteById(id)
				.orElseThrow( () -> new UserNotFoundException( "User by id " + id + " was not found" ) );
	}
	
	public void deleteNote(Long id) {
		
		noteRepo.deleteNoteById(id);
	}
	
	

}
