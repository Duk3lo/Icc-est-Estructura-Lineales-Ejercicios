from SignValidator import is_valid

def run_sign_validator():
    cadena1 = "{[()]}"   # VALIDO
    cadena2 = "{[(])}"   # NO VALIDO

    print(f"Cadena: {cadena1} es valida? {is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es valida? {is_valid(cadena2)}")


if __name__ == "__main__":
    run_sign_validator()
