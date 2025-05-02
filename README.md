# 💱 Conversor de Monedas - ONE Backend

**Aplicación Java para conversión de divisas usando ExchangeRate-API**  
[![Java](https://img.shields.io/badge/Java-17-%23ED8B00?logo=openjdk)](https://openjdk.org/)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

<img src="screenshot.png" width="400" alt="Demo de la aplicación">

> Proyecto desarrollado para el programa ONE-Backend. Convierte entre múltiples divisas usando tasas de cambio en tiempo real.

## 🌟 Características Principales
- ✅ Conversión en tiempo real usando [ExchangeRate-API](https://www.exchangerate-api.com/)
- ✅ Gestión personalizable de lista de monedas
- ✅ Historial de conversiones
- ✅ Interfaz de línea de comandos (CLI) intuitiva
- ✅ Soporte para 160+ divisas internacionales

## 🚀 Primeros Pasos

### Requisitos Previos
- Java 17 o superior
- API Key de [ExchangeRate-API](https://www.exchangerate-api.com/) (gratuita)
- IDE recomendado: IntelliJ IDEA

### ⚙️ Configuración
1. **Obtén tu API Key:**
   - Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/sign-up)
   - Verifica tu correo y copia tu clave API

2. **Configuración del Entorno:**
```bash
# Clona el repositorio
git clone https://github.com/tu-usuario/conversor-monedas.git

# Configura la variable de entorno (IntelliJ)
# 1. Click derecho en Main.java > Modify Run Configuration...
# 2. En Environment Variables añade:
EXCHANGE_API_KEY=tu_clave_aquí
