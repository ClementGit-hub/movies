package com.blq.fr.gestionDesOffresBackend.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blq.fr.gestionDesOffresBackend.model.Note;
import com.blq.fr.gestionDesOffresBackend.service.NoteService;


@CrossOrigin(origins = "http://192.168.100.178:4200")
//@CrossOrigin(origins = "http://192.168.100.178:4200")
@RestController
//@RequestMapping("/stock_offres")
@RequestMapping("/note")
public class NoteResource {
	
	private final NoteService noteService;

	public NoteResource(NoteService noteService) {
		
		this.noteService = noteService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Note>> getAllNotes() {
		
		List<Note> notes = noteService.findAllNotes();
		
		return new ResponseEntity<>(notes, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Note> getNoteById(@PathVariable("id") Long id) {
		
		Note note = noteService.findNoteById(id);
		
		return new ResponseEntity<>(note, HttpStatus.OK);
	}
	
//	@PostMapping("/add")
//	public ResponseEntity<Offre> addPartenaire(@RequestBody Offre offre) {
//		
//		Offre newOffre = offreService.addOffre(offre);
//		
//		return new ResponseEntity<>(newOffre, HttpStatus.OK);
//	}
	
	@PutMapping("/update")
	public ResponseEntity<Note> updateNote(@RequestBody Note offre) {
		
		Note updateNote = noteService.updateNote(offre);
		
		return new ResponseEntity<>(updateNote, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable("id") Long id) {
		
		noteService.deleteNote(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
