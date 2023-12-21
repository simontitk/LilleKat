let n = readline();

for (let i=0; i<n; i++) {
    let sounds = readline().split(" ");
    let line = "";
    let knownSounds = new Set();
    while (line !== "what does the fox say?") {
        line = readline();
        knownSounds.add(line.split(" goes ")[1]);
    }
    console.log(sounds.filter(s => !knownSounds.has(s)).join(" "));
}