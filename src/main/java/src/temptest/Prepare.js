const s = "xxx::xxxx";
const split = s.split("::");
laKey=split[1];     // prepare for getting loanNotes identifier

// query a flux of loanNotes
LoanNoteDb.query(laKey);
