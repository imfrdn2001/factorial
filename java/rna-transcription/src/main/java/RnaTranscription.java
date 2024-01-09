final class RnaTranscription {

    String transcribe(final String dnaStrand) {
        return dnaStrand.chars()
                .mapToObj(c -> switch ((char) c) {
                    case 'G' -> 'C';
                    case 'C' -> 'G';
                    case 'T' -> 'A';
                    case 'A' -> 'U';
                    default -> throw new IllegalArgumentException("Invalid nucleotide");
                })
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}