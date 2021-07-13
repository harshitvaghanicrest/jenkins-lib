def info(message) {
    script {
        echo "INFO: ${message}"
    }
}

def debug(message) {
    script {
        echo "DEBUG: ${message}"
    }
}

def error(message) {
    script {
        echo "ERROR: ${message}"
    }
}
