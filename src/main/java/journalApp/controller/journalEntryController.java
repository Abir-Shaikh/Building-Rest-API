package journalApp.controller;

import journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryController {

    private Map<Long , JournalEntry> journalentries = new HashMap<>();

    @GetMapping("/entries")
    public List<JournalEntry> getall(){
        return new ArrayList<>(journalentries.values());
    }

    @PostMapping("/create")
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalentries.put(myEntry.getId(), myEntry);
        return true;
    }
}
