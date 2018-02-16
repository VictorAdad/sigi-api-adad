# -*- coding: utf8 -*-
# The Grinder 3.11
# HTTP script recorded by TCPProxy at 27/10/2017 04:26:17 PM

from net.grinder.script import Test
from net.grinder.script.Grinder import grinder
from net.grinder.plugin.http import HTTPPluginControl, HTTPRequest
from HTTPClient import NVPair
connectionDefaults = HTTPPluginControl.getConnectionDefaults()
httpUtilities = HTTPPluginControl.getHTTPUtilities()

# To use a proxy server, uncomment the next line and set the host and port.
# connectionDefaults.setProxyServer("localhost", 8001)

def createRequest(test, url, headers=None):
    """Create an instrumented HTTPRequest."""
    request = HTTPRequest(url=url)
    if headers: request.headers=headers
    test.record(request, HTTPRequest.getHttpMethodFilter())
    return request

# These definitions at the top level of the file are evaluated once,
# when the worker process is started.

connectionDefaults.defaultHeaders = \
  [ NVPair('User-Agent', 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'),
    NVPair('Accept-Language', 'es-419,es;q=0.8,en;q=0.6'),
    NVPair('Accept-Encoding', 'gzip, deflate'), ]

headers0= \
  [ NVPair('Accept', 'text/css,*/*;q=0.1'),
    NVPair('Referer', 'http://10.0.30.14/sigi/'), ]

headers1= \
  [ NVPair('Accept', '*/*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/'), ]

headers2= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/'), ]

headers3= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/noticia-hecho/datos-generales'), ]

headers4= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/noticia-hecho/datos-generales'), ]

headers5= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/noticia-hecho/personas'), ]

headers6= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/personas/persona-fisica-imputado'), ]

headers7= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/noticia-hecho/lugares'), ]

headers8= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/lugares/create'), ]

headers9= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/noticia-hecho/relaciones'), ]

headers10= \
  [ NVPair('Accept', 'application/json, text/plain, */*'),
    NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/relaciones/create'), ]

url0 = 'http://10.0.30.14:80'
url1 = 'http://code.ionicframework.com:80'
url2 = 'http://10.0.30.14:9001'

# CARGA SITIO SIGI
request101 = createRequest(Test(101, 'GET /'), url0)

request102 = createRequest(Test(102, 'GET styles.eea93588bf3c90c1d698.bundle.css'), url0, headers0)

request103 = createRequest(Test(103, 'GET inline.d7fd64a1df5bca47e1c5.bundle.js'), url0, headers1)

request104 = createRequest(Test(104, 'GET polyfills.fe3226b3292e1cacaff3.bundle.js'), url0, headers1)

request105 = createRequest(Test(105, 'GET scripts.acaca3804681b0738cad.bundle.js'), url0, headers1)

request106 = createRequest(Test(106, 'GET vendor.a88fcc0b9bc2240385b3.bundle.js'), url0, headers1)

request107 = createRequest(Test(107, 'GET main.4ea8f2727a5cc31d9c69.bundle.js'), url0, headers1)

request201 = createRequest(Test(201, 'GET ionicons.min.css'), url1, headers0)

request301 = createRequest(Test(301, 'GET options'), url2, headers2)

request401 = createRequest(Test(401, 'GET options'), url2, headers2)

request501 = createRequest(Test(501, 'GET options'), url2, headers2)

request601 = createRequest(Test(601, 'GET options'), url2, headers2)

request701 = createRequest(Test(701, 'GET options'), url2, headers2)

request801 = createRequest(Test(801, 'GET options'), url2, headers2)

request901 = createRequest(Test(901, 'GET options'), url2, headers2)

request1001 = createRequest(Test(1001, 'GET options'), url2, headers2)

request1101 = createRequest(Test(1101, 'GET options'), url2, headers2)

request1201 = createRequest(Test(1201, 'GET options'), url2, headers2)

request1301 = createRequest(Test(1301, 'GET options'), url2, headers2)

request1401 = createRequest(Test(1401, 'GET options'), url2, headers2)

request1501 = createRequest(Test(1501, 'GET options'), url2, headers2)

request1601 = createRequest(Test(1601, 'GET options'), url2, headers2)

request1701 = createRequest(Test(1701, 'GET options'), url2, headers2)

request1801 = createRequest(Test(1801, 'GET options'), url2, headers2)

request1901 = createRequest(Test(1901, 'GET options'), url2, headers2)

request2001 = createRequest(Test(2001, 'GET options'), url2, headers2)

request2101 = createRequest(Test(2101, 'GET casos'), url2, headers2)

# CREA NUEVO CASO
request2201 = createRequest(Test(2201, 'GET arma.svg'), url0, headers3)

# REGISTRA DATOS GENERALES
request2301 = createRequest(Test(2301, 'GET search'), url2, headers3)

request2401 = createRequest(Test(2401, 'OPTIONS casos'), url2)

request2501 = createRequest(Test(2501, 'POST casos'), url2, headers3)

request2601 = createRequest(Test(2601, 'GET 47'), url2, headers4)

request2701 = createRequest(Test(2701, 'GET 47'), url2, headers4)

# REGISTRA PERSONA VICTIMA
request2801 = createRequest(Test(2801, 'GET page'), url2, headers5)

request2901 = createRequest(Test(2901, 'GET options'), url2, headers6)

request3001 = createRequest(Test(3001, 'GET options'), url2, headers6)

request3101 = createRequest(Test(3101, 'GET options'), url2, headers6)

request3201 = createRequest(Test(3201, 'GET options'), url2, headers6)

request3301 = createRequest(Test(3301, 'GET options'), url2, headers6)

request3401 = createRequest(Test(3401, 'GET options'), url2, headers6)

request3501 = createRequest(Test(3501, 'GET options'), url2, headers6)

request3601 = createRequest(Test(3601, 'GET options'), url2, headers6)

request3701 = createRequest(Test(3701, 'GET options'), url2, headers6)

request3801 = createRequest(Test(3801, 'GET options'), url2, headers6)

request3901 = createRequest(Test(3901, 'GET options'), url2, headers6)

request4001 = createRequest(Test(4001, 'GET options'), url2, headers6)

request4101 = createRequest(Test(4101, 'GET options'), url2, headers6)

request4201 = createRequest(Test(4201, 'GET options'), url2, headers6)

request4301 = createRequest(Test(4301, 'GET options'), url2, headers6)

request4401 = createRequest(Test(4401, 'GET options'), url2, headers6)

request4501 = createRequest(Test(4501, 'GET options'), url2, headers6)

request4601 = createRequest(Test(4601, 'GET options'), url2, headers6)

request4701 = createRequest(Test(4701, 'OPTIONS personas'), url2)

request4801 = createRequest(Test(4801, 'POST personas'), url2, headers6)

request4901 = createRequest(Test(4901, 'GET 47'), url2, headers5)

request5001 = createRequest(Test(5001, 'GET page'), url2, headers5)

# REGISTRA PERSONA IMPUTADO
request5101 = createRequest(Test(5101, 'GET options'), url2, headers6)

request5201 = createRequest(Test(5201, 'GET options'), url2, headers6)

request5301 = createRequest(Test(5301, 'GET options'), url2, headers6)

request5401 = createRequest(Test(5401, 'GET options'), url2, headers6)

request5501 = createRequest(Test(5501, 'GET options'), url2, headers6)

request5601 = createRequest(Test(5601, 'GET options'), url2, headers6)

request5701 = createRequest(Test(5701, 'GET options'), url2, headers6)

request5801 = createRequest(Test(5801, 'GET options'), url2, headers6)

request5901 = createRequest(Test(5901, 'GET options'), url2, headers6)

request6001 = createRequest(Test(6001, 'GET options'), url2, headers6)

request6101 = createRequest(Test(6101, 'GET options'), url2, headers6)

request6201 = createRequest(Test(6201, 'GET options'), url2, headers6)

request6301 = createRequest(Test(6301, 'GET options'), url2, headers6)

request6401 = createRequest(Test(6401, 'GET options'), url2, headers6)

request6501 = createRequest(Test(6501, 'GET options'), url2, headers6)

request6601 = createRequest(Test(6601, 'GET options'), url2, headers6)

request6701 = createRequest(Test(6701, 'GET options'), url2, headers6)

request6801 = createRequest(Test(6801, 'GET options'), url2, headers6)

request6901 = createRequest(Test(6901, 'POST personas'), url2, headers6)

request7001 = createRequest(Test(7001, 'GET 47'), url2, headers5)

request7101 = createRequest(Test(7101, 'GET page'), url2, headers5)

# REGISTRA LUGAR
request7201 = createRequest(Test(7201, 'GET page'), url2, headers7)

request7301 = createRequest(Test(7301, 'GET options'), url2, headers8)

request7401 = createRequest(Test(7401, 'GET options'), url2, headers8)

request7501 = createRequest(Test(7501, 'GET options'), url2, headers8)

request7601 = createRequest(Test(7601, 'GET options'), url2, headers8)

request7701 = createRequest(Test(7701, 'GET options'), url2, headers8)

request7801 = createRequest(Test(7801, 'GET options'), url2, headers8)

request7901 = createRequest(Test(7901, 'GET options'), url2, headers8)

request8001 = createRequest(Test(8001, 'GET options'), url2, headers8)

request8101 = createRequest(Test(8101, 'GET options'), url2, headers8)

request8201 = createRequest(Test(8201, 'GET options'), url2, headers8)

request8301 = createRequest(Test(8301, 'GET options'), url2, headers8)

request8401 = createRequest(Test(8401, 'GET options'), url2, headers8)

request8501 = createRequest(Test(8501, 'GET options'), url2, headers8)

request8601 = createRequest(Test(8601, 'GET options'), url2, headers8)

request8701 = createRequest(Test(8701, 'GET options'), url2, headers8)

request8801 = createRequest(Test(8801, 'GET options'), url2, headers8)

request8901 = createRequest(Test(8901, 'GET options'), url2, headers8)

request9001 = createRequest(Test(9001, 'GET options'), url2, headers8)

request9101 = createRequest(Test(9101, 'GET options'), url2, headers8)

request9201 = createRequest(Test(9201, 'OPTIONS lugares'), url2)

request9301 = createRequest(Test(9301, 'POST lugares'), url2, headers8)

request9401 = createRequest(Test(9401, 'GET 47'), url2, headers7)

request9501 = createRequest(Test(9501, 'GET page'), url2, headers7)

# REGISTRA RELACION IMPUTADO-VICTIMA-DELITO
request9601 = createRequest(Test(9601, 'GET page'), url2, headers9)

request9701 = createRequest(Test(9701, 'GET options'), url2, headers10)

request9801 = createRequest(Test(9801, 'GET options'), url2, headers10)

request9901 = createRequest(Test(9901, 'GET options'), url2, headers10)

request10001 = createRequest(Test(10001, 'GET options'), url2, headers10)

request10101 = createRequest(Test(10101, 'GET options'), url2, headers10)

request10201 = createRequest(Test(10201, 'GET options'), url2, headers10)

request10301 = createRequest(Test(10301, 'GET options'), url2, headers10)

request10401 = createRequest(Test(10401, 'GET options'), url2, headers10)

request10501 = createRequest(Test(10501, 'GET options'), url2, headers10)

request10601 = createRequest(Test(10601, 'GET 47'), url2, headers10)

request10701 = createRequest(Test(10701, 'GET 47'), url2, headers10)

request10801 = createRequest(Test(10801, 'GET 47'), url2, headers10)

request10901 = createRequest(Test(10901, 'GET 47'), url2, headers10)

request11001 = createRequest(Test(11001, 'GET 1'), url2, headers10)

request11101 = createRequest(Test(11101, 'GET 2'), url2, headers10)

request11201 = createRequest(Test(11201, 'GET 3'), url2, headers10)

request11301 = createRequest(Test(11301, 'GET 4'), url2, headers10)

request11401 = createRequest(Test(11401, 'GET 5'), url2, headers10)

request11501 = createRequest(Test(11501, 'GET 6'), url2, headers10)

request11601 = createRequest(Test(11601, 'GET 7'), url2, headers10)

request11701 = createRequest(Test(11701, 'GET 8'), url2, headers10)

request11801 = createRequest(Test(11801, 'GET 9'), url2, headers10)

request11901 = createRequest(Test(11901, 'GET 10'), url2, headers10)

request12001 = createRequest(Test(12001, 'GET 111'), url2, headers10)

request12101 = createRequest(Test(12101, 'GET page'), url2, headers10)

request12201 = createRequest(Test(12201, 'OPTIONS tipo-relacion-persona'), url2)

request12301 = createRequest(Test(12301, 'POST tipo-relacion-persona'), url2, headers10)

request12401 = createRequest(Test(12401, 'GET 47'), url2, headers9)

request12501 = createRequest(Test(12501, 'GET page'), url2, headers9)


class TestRunner:
  """A TestRunner instance is created for each worker thread."""

  # A method for each recorded page.
  def page1(self):
    """GET / (requests 101-107)."""
    result = request101.GET('/sigi/', None,
      ( NVPair('Accept', 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8'),
        NVPair('If-None-Match', '\"503-55c8a12787ca9\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 16:49:28 GMT'), ))

    grinder.sleep(36)
    request102.GET('/sigi/styles.eea93588bf3c90c1d698.bundle.css', None,
      ( NVPair('If-None-Match', '\"5faaf-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    grinder.sleep(35411)
    request103.GET('/sigi/inline.d7fd64a1df5bca47e1c5.bundle.js', None,
      ( NVPair('If-None-Match', '\"5c0-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    request104.GET('/sigi/polyfills.fe3226b3292e1cacaff3.bundle.js', None,
      ( NVPair('If-None-Match', '\"1522c-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    request105.GET('/sigi/scripts.acaca3804681b0738cad.bundle.js', None,
      ( NVPair('If-None-Match', '\"24b51-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    request106.GET('/sigi/vendor.a88fcc0b9bc2240385b3.bundle.js', None,
      ( NVPair('If-None-Match', '\"1e0124-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    request107.GET('/sigi/main.4ea8f2727a5cc31d9c69.bundle.js', None,
      ( NVPair('If-None-Match', '\"1fb571-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    return result

  def page2(self):
    """GET ionicons.min.css (request 201)."""
    result = request201.GET('/ionicons/2.0.1/css/ionicons.min.css', None,
      ( NVPair('If-Modified-Since', 'Thu, 26 Oct 2017 14:18:49 GMT'), ))

    return result

  def page3(self):
    """GET options (request 301)."""
    result = request301.GET('/v1/catalogos/persona/sexo/options')

    return result

  def page4(self):
    """GET options (request 401)."""
    result = request401.GET('/v1/catalogos/pais/options')

    return result

  def page5(self):
    """GET options (request 501)."""
    result = request501.GET('/v1/catalogos/persona/escolaridad/options')

    return result

  def page6(self):
    """GET options (request 601)."""
    result = request601.GET('/v1/catalogos/persona/estado-civil/options')

    return result

  def page7(self):
    """GET options (request 701)."""
    result = request701.GET('/v1/catalogos/persona/ocupacion/options')

    return result

  def page8(self):
    """GET options (request 801)."""
    result = request801.GET('/v1/catalogos/persona/idioma/options')

    return result

  def page9(self):
    """GET options (request 901)."""
    result = request901.GET('/v1/catalogos/persona/interprete/options')

    return result

  def page10(self):
    """GET options (request 1001)."""
    result = request1001.GET('/v1/catalogos/persona/grupo-etnico/options')

    return result

  def page11(self):
    """GET options (request 1101)."""
    result = request1101.GET('/v1/catalogos/persona/adiccion/options')

    return result

  def page12(self):
    """GET options (request 1201)."""
    result = request1201.GET('/v1/catalogos/persona/nacionalidad/options')

    return result

  def page13(self):
    """GET options (request 1301)."""
    result = request1301.GET('/v1/catalogos/tipo-domicilio/options')

    return result

  def page14(self):
    """GET options (request 1401)."""
    result = request1401.GET('/v1/base/tipos-intervinientes/options')

    return result

  def page15(self):
    """GET options (request 1501)."""
    result = request1501.GET('/v1/catalogos/persona/alfabetismo/options')

    return result

  def page16(self):
    """GET options (request 1601)."""
    result = request1601.GET('/v1/catalogos/solicitud-preliminar/perito-materia/options')

    return result

  def page17(self):
    """GET options (request 1701)."""
    result = request1701.GET('/v1/catalogos/solicitud-preliminar/tipo-examen/options')

    return result

  def page18(self):
    """GET options (request 1801)."""
    result = request1801.GET('/v1/catalogos/solicitud-preliminar/denuncia-querella/options')

    return result

  def page19(self):
    """GET options (request 1901)."""
    result = request1901.GET('/v1/catalogos/predenuncia/tipo-persona/options')

    return result

  def page20(self):
    """GET options (request 2001)."""
    result = request2001.GET('/v1/catalogos/solicitud-preliminar/victima-querellante/options')

    return result

  def page21(self):
    """GET casos (request 2101)."""
    result = request2101.GET('/v1/base/casos')

    return result

  def page22(self):
    """GET arma.svg (request 2201)."""
    result = request2201.GET('/sigi/assets/images/iconos/arma.svg', None,
      ( NVPair('If-None-Match', '\"14c2-55c88f6e406c0\"'),
        NVPair('If-Modified-Since', 'Fri, 27 Oct 2017 15:30:11 GMT'), ))

    return result

  def page23(self):
    """GET search (request 2301)."""
    self.token_name = \
      'VIOLENCIA'
    result = request2301.GET('/v1/catalogos/delitos/search' + '?name=' + self.token_name)

    return result

  def page24(self):
    """OPTIONS casos (request 2401)."""
    result = request2401.OPTIONS('/v1/base/casos',
      '',
      ( NVPair('Accept', '*/*'),
        NVPair('Referer', 'http://10.0.30.14/sigi/noticia-hecho/datos-generales'), ))

    return result

  def page25(self):
    """POST casos (request 2501)."""
    result = request2501.POST('/v1/base/casos',
      '''{\n  \"titulo\": \"ROBO DE AUTO CON VIOLENCIA\",\n  \"descripcion\": \"ROBO CON VIOLENCIA\",\n  \"delito\": \"ROBO CON VIOLENCIA\",\n  \"name\": \"NIC:   -  NUC: \",\n  \"delitoCaso\": {\n    \"delito\": {\n      \"id\": 239\n    }\n  },\n  \"nic\": \"TOL/MET/MA/MPI/239/00126/17/09\",\n  \"created\": null\n}''')

    return result

  def page26(self):
    """GET 47 (request 2601)."""
    result = request2601.GET('/v1/base/casos/47')

    return result

  def page27(self):
    """GET 47 (request 2701)."""
    result = request2701.GET('/v1/base/casos/47')

    return result

  def page28(self):
    """GET page (request 2801)."""
    result = request2801.GET('/v1/base/personas-casos/casos/47/page')

    return result

  def page29(self):
    """GET options (request 2901)."""
    result = request2901.GET('/v1/catalogos/pais/options')

    return result

  def page30(self):
    """GET options (request 3001)."""
    result = request3001.GET('/v1/catalogos/persona/grupo-etnico/options')

    return result

  def page31(self):
    """GET options (request 3101)."""
    result = request3101.GET('/v1/catalogos/persona/escolaridad/options')

    return result

  def page32(self):
    """GET options (request 3201)."""
    result = request3201.GET('/v1/catalogos/persona/sexo/options')

    return result

  def page33(self):
    """GET options (request 3301)."""
    result = request3301.GET('/v1/catalogos/persona/interprete/options')

    return result

  def page34(self):
    """GET options (request 3401)."""
    result = request3401.GET('/v1/catalogos/persona/ocupacion/options')

    return result

  def page35(self):
    """GET options (request 3501)."""
    result = request3501.GET('/v1/catalogos/persona/estado-civil/options')

    return result

  def page36(self):
    """GET options (request 3601)."""
    result = request3601.GET('/v1/catalogos/persona/idioma/options')

    return result

  def page37(self):
    """GET options (request 3701)."""
    result = request3701.GET('/v1/catalogos/persona/adiccion/options')

    return result

  def page38(self):
    """GET options (request 3801)."""
    result = request3801.GET('/v1/catalogos/tipo-domicilio/options')

    return result

  def page39(self):
    """GET options (request 3901)."""
    result = request3901.GET('/v1/catalogos/persona/nacionalidad/options')

    return result

  def page40(self):
    """GET options (request 4001)."""
    result = request4001.GET('/v1/base/tipos-intervinientes/options')

    return result

  def page41(self):
    """GET options (request 4101)."""
    result = request4101.GET('/v1/catalogos/persona/alfabetismo/options')

    return result

  def page42(self):
    """GET options (request 4201)."""
    result = request4201.GET('/v1/catalogos/solicitud-preliminar/perito-materia/options')

    return result

  def page43(self):
    """GET options (request 4301)."""
    result = request4301.GET('/v1/catalogos/solicitud-preliminar/tipo-examen/options')

    return result

  def page44(self):
    """GET options (request 4401)."""
    result = request4401.GET('/v1/catalogos/solicitud-preliminar/denuncia-querella/options')

    return result

  def page45(self):
    """GET options (request 4501)."""
    result = request4501.GET('/v1/catalogos/solicitud-preliminar/victima-querellante/options')

    return result

  def page46(self):
    """GET options (request 4601)."""
    result = request4601.GET('/v1/catalogos/predenuncia/tipo-persona/options')

    return result

  def page47(self):
    """OPTIONS personas (request 4701)."""
    result = request4701.OPTIONS('/v1/base/personas',
      '',
      ( NVPair('Accept', '*/*'),
        NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/personas/persona-fisica-imputado'), ))

    return result

  def page48(self):
    """POST personas (request 4801)."""
    result = request4801.POST('/v1/base/personas',
      '''{\n  \"id\": \"\",\n  \"tipoPersona\": \"FÃ­sica\",\n  \"nombre\": \"MARIEL\",\n  \"paterno\": \"MORENO\",\n  \"materno\": \"MORALES\",\n  \"fechaNacimiento\": \"\",\n  \"edad\": \"45\",\n  \"detenido\": \"\",\n  \"nacionalidadReligion\": {\n    \"id\": \"\"\n  },\n  \"idiomaIdentificacion\": {\n    \"id\": \"\"\n  },\n  \"localizacionPersona\": [],\n  \"mediaFiliacion\": {\n    \"id\": \"\",\n    \"orejaDerecha\": {\n      \"id\": \"\"\n    },\n    \"orejaIzquierda\": {\n      \"id\": \"\"\n    },\n    \"complexionPielSangre\": {\n      \"id\": \"\"\n    },\n    \"caraNariz\": {\n      \"id\": \"\"\n    },\n    \"frenteMenton\": {\n      \"id\": \"\"\n    },\n    \"cejaBoca\": {\n      \"id\": \"\"\n    },\n    \"cabello\": {\n      \"id\": \"\"\n    },\n    \"labioOjo\": {\n      \"id\": \"\"\n    },\n    \"usaAnteojos\": false,\n    \"cicatrices\": \"\",\n    \"tatuajes\": \"\",\n    \"lunares\": \"\",\n    \"disminucionesFisicas\": \"\",\n    \"protesis\": \"\",\n    \"otras\": \"\",\n    \"estatura\": \"\",\n    \"peso\": \"\"\n  },\n  \"sexo\": {\n    \"id\": 1\n  },\n  \"pais\": {},\n  \"estado\": {\n    \"id\": \"\"\n  },\n  \"municipio\": {\n    \"id\": \"\"\n  },\n  \"escolaridad\": {},\n  \"ocupacion\": {\n    \"id\": 4\n  },\n  \"grupoEtnico\": {},\n  \"alfabetismo\": {},\n  \"interprete\": {},\n  \"adiccion\": {},\n  \"estadoCivil\": {},\n  \"personaCaso\": [\n    {\n      \"caso\": {\n        \"id\": 47\n      },\n      \"tipoInterviniente\": {\n        \"id\": \"9\"\n      },\n      \"detalleDetenido\": {\n        \"fechaDetencion\": null,\n        \"fechaDeclaracion\": null,\n        \"horaDetenido\": \"\",\n        \"tipoDetenido\": {\n          \"id\": \"\"\n        }\n      }\n    }\n  ],\n  \"aliasNombrePersona\": []\n}''')

    return result

  def page49(self):
    """GET 47 (request 4901)."""
    result = request4901.GET('/v1/base/casos/47')

    return result

  def page50(self):
    """GET page (request 5001)."""
    result = request5001.GET('/v1/base/personas-casos/casos/47/page')

    return result

  def page51(self):
    """GET options (request 5101)."""
    result = request5101.GET('/v1/catalogos/pais/options')

    return result

  def page52(self):
    """GET options (request 5201)."""
    result = request5201.GET('/v1/catalogos/persona/sexo/options')

    return result

  def page53(self):
    """GET options (request 5301)."""
    result = request5301.GET('/v1/catalogos/persona/escolaridad/options')

    return result

  def page54(self):
    """GET options (request 5401)."""
    result = request5401.GET('/v1/catalogos/persona/ocupacion/options')

    return result

  def page55(self):
    """GET options (request 5501)."""
    result = request5501.GET('/v1/catalogos/persona/estado-civil/options')

    return result

  def page56(self):
    """GET options (request 5601)."""
    result = request5601.GET('/v1/catalogos/persona/idioma/options')

    return result

  def page57(self):
    """GET options (request 5701)."""
    result = request5701.GET('/v1/catalogos/persona/grupo-etnico/options')

    return result

  def page58(self):
    """GET options (request 5801)."""
    result = request5801.GET('/v1/catalogos/persona/interprete/options')

    return result

  def page59(self):
    """GET options (request 5901)."""
    result = request5901.GET('/v1/catalogos/persona/adiccion/options')

    return result

  def page60(self):
    """GET options (request 6001)."""
    result = request6001.GET('/v1/catalogos/persona/nacionalidad/options')

    return result

  def page61(self):
    """GET options (request 6101)."""
    result = request6101.GET('/v1/catalogos/tipo-domicilio/options')

    return result

  def page62(self):
    """GET options (request 6201)."""
    result = request6201.GET('/v1/base/tipos-intervinientes/options')

    return result

  def page63(self):
    """GET options (request 6301)."""
    result = request6301.GET('/v1/catalogos/solicitud-preliminar/perito-materia/options')

    return result

  def page64(self):
    """GET options (request 6401)."""
    result = request6401.GET('/v1/catalogos/persona/alfabetismo/options')

    return result

  def page65(self):
    """GET options (request 6501)."""
    result = request6501.GET('/v1/catalogos/solicitud-preliminar/tipo-examen/options')

    return result

  def page66(self):
    """GET options (request 6601)."""
    result = request6601.GET('/v1/catalogos/solicitud-preliminar/denuncia-querella/options')

    return result

  def page67(self):
    """GET options (request 6701)."""
    result = request6701.GET('/v1/catalogos/solicitud-preliminar/victima-querellante/options')

    return result

  def page68(self):
    """GET options (request 6801)."""
    result = request6801.GET('/v1/catalogos/predenuncia/tipo-persona/options')

    return result

  def page69(self):
    """POST personas (request 6901)."""
    result = request6901.POST('/v1/base/personas',
      '''{\n  \"id\": \"\",\n  \"tipoPersona\": \"FÃ­sica\",\n  \"nombre\": \"MIGUEL\",\n  \"paterno\": \"BARRADAS\",\n  \"materno\": \"DOMINGUEZ\",\n  \"fechaNacimiento\": \"\",\n  \"edad\": \"30\",\n  \"nacionalidadReligion\": {\n    \"id\": \"\"\n  },\n  \"idiomaIdentificacion\": {\n    \"id\": \"\"\n  },\n  \"localizacionPersona\": [],\n  \"mediaFiliacion\": {\n    \"id\": \"\",\n    \"orejaDerecha\": {\n      \"id\": \"\"\n    },\n    \"orejaIzquierda\": {\n      \"id\": \"\"\n    },\n    \"complexionPielSangre\": {\n      \"id\": \"\"\n    },\n    \"caraNariz\": {\n      \"id\": \"\"\n    },\n    \"frenteMenton\": {\n      \"id\": \"\"\n    },\n    \"cejaBoca\": {\n      \"id\": \"\"\n    },\n    \"cabello\": {\n      \"id\": \"\"\n    },\n    \"labioOjo\": {\n      \"id\": \"\"\n    },\n    \"disminucionesFisicas\": \"\",\n    \"estatura\": \"\",\n    \"peso\": \"\"\n  },\n  \"sexo\": {\n    \"id\": 0\n  },\n  \"pais\": {},\n  \"estado\": {\n    \"id\": \"\"\n  },\n  \"municipio\": {\n    \"id\": \"\"\n  },\n  \"escolaridad\": {},\n  \"ocupacion\": {\n    \"id\": 3\n  },\n  \"grupoEtnico\": {},\n  \"alfabetismo\": {},\n  \"interprete\": {},\n  \"adiccion\": {},\n  \"estadoCivil\": {},\n  \"personaCaso\": [\n    {\n      \"caso\": {\n        \"id\": 47\n      },\n      \"tipoInterviniente\": {\n        \"id\": \"5\"\n      },\n      \"detalleDetenido\": {\n        \"fechaDetencion\": null,\n        \"fechaDeclaracion\": null,\n        \"horaDetenido\": \"\",\n        \"tipoDetenido\": {\n          \"id\": \"\"\n        }\n      }\n    }\n  ],\n  \"aliasNombrePersona\": []\n}''')

    return result

  def page70(self):
    """GET 47 (request 7001)."""
    result = request7001.GET('/v1/base/casos/47')

    return result

  def page71(self):
    """GET page (request 7101)."""
    result = request7101.GET('/v1/base/personas-casos/casos/47/page')

    return result

  def page72(self):
    """GET page (request 7201)."""
    result = request7201.GET('/v1/base/lugares/casos/47/page')

    return result

  def page73(self):
    """GET options (request 7301)."""
    result = request7301.GET('/v1/catalogos/pais/options')

    return result

  def page74(self):
    """GET options (request 7401)."""
    result = request7401.GET('/v1/catalogos/persona/sexo/options')

    return result

  def page75(self):
    """GET options (request 7501)."""
    result = request7501.GET('/v1/catalogos/persona/escolaridad/options')

    return result

  def page76(self):
    """GET options (request 7601)."""
    result = request7601.GET('/v1/catalogos/persona/ocupacion/options')

    return result

  def page77(self):
    """GET options (request 7701)."""
    result = request7701.GET('/v1/catalogos/persona/estado-civil/options')

    return result

  def page78(self):
    """GET options (request 7801)."""
    result = request7801.GET('/v1/catalogos/persona/idioma/options')

    return result

  def page79(self):
    """GET options (request 7901)."""
    result = request7901.GET('/v1/catalogos/persona/grupo-etnico/options')

    return result

  def page80(self):
    """GET options (request 8001)."""
    result = request8001.GET('/v1/catalogos/persona/interprete/options')

    return result

  def page81(self):
    """GET options (request 8101)."""
    result = request8101.GET('/v1/catalogos/persona/adiccion/options')

    return result

  def page82(self):
    """GET options (request 8201)."""
    result = request8201.GET('/v1/catalogos/persona/nacionalidad/options')

    return result

  def page83(self):
    """GET options (request 8301)."""
    result = request8301.GET('/v1/catalogos/tipo-domicilio/options')

    return result

  def page84(self):
    """GET options (request 8401)."""
    result = request8401.GET('/v1/base/tipos-intervinientes/options')

    return result

  def page85(self):
    """GET options (request 8501)."""
    result = request8501.GET('/v1/catalogos/solicitud-preliminar/perito-materia/options')

    return result

  def page86(self):
    """GET options (request 8601)."""
    result = request8601.GET('/v1/catalogos/persona/alfabetismo/options')

    return result

  def page87(self):
    """GET options (request 8701)."""
    result = request8701.GET('/v1/catalogos/solicitud-preliminar/tipo-examen/options')

    return result

  def page88(self):
    """GET options (request 8801)."""
    result = request8801.GET('/v1/catalogos/solicitud-preliminar/denuncia-querella/options')

    return result

  def page89(self):
    """GET options (request 8901)."""
    result = request8901.GET('/v1/catalogos/solicitud-preliminar/victima-querellante/options')

    return result

  def page90(self):
    """GET options (request 9001)."""
    result = request9001.GET('/v1/catalogos/predenuncia/tipo-persona/options')

    return result

  def page91(self):
    """GET options (request 9101)."""
    result = request9101.GET('/v1/catalogos/estado/pais/5/options')

    return result

  def page92(self):
    """OPTIONS lugares (request 9201)."""
    result = request9201.OPTIONS('/v1/base/lugares',
      '',
      ( NVPair('Accept', '*/*'),
        NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/lugares/create'), ))

    return result

  def page93(self):
    """POST lugares (request 9301)."""
    result = request9301.POST('/v1/base/lugares',
      '''{\n  \"id\": \"\",\n  \"tipo\": \"POCO\",\n  \"tipoZona\": \"AZUL\",\n  \"calle\": \"TAMBORREL\",\n  \"referencias\": \"ESQUINA CON TOLEDO\",\n  \"estadoOtro\": \"ANGUILLA ESTADO\",\n  \"municipioOtro\": \"ANGUILLA MUNICIPIO\",\n  \"coloniaOtro\": \"ANGUILLA COLONIA\",\n  \"fecha\": \"2017-10-26\",\n  \"hora\": \"08:00\",\n  \"dia\": \"JUEVES\",\n  \"numExterior\": \"123\",\n  \"detalleLugar\": {\n    \"id\": 3\n  },\n  \"pais\": {\n    \"id\": 5\n  },\n  \"caso\": {\n    \"id\": 47\n  },\n  \"latitud\": 19.4968732,\n  \"longitud\": -99.7232673\n}''')

    return result

  def page94(self):
    """GET 47 (request 9401)."""
    result = request9401.GET('/v1/base/casos/47')

    return result

  def page95(self):
    """GET page (request 9501)."""
    result = request9501.GET('/v1/base/lugares/casos/47/page')

    return result

  def page96(self):
    """GET page (request 9601)."""
    result = request9601.GET('/v1/base/tipo-relacion-persona/casos/47/page')

    return result

  def page97(self):
    """GET options (request 9701)."""
    result = request9701.GET('/v1/catalogos/relacion/grado-participacion/options')

    return result

  def page98(self):
    """GET options (request 9801)."""
    result = request9801.GET('/v1/catalogos/relacion/forma-accion/options')

    return result

  def page99(self):
    """GET options (request 9901)."""
    result = request9901.GET('/v1/catalogos/relacion/clasificacion-delito/options')

    return result

  def page100(self):
    """GET options (request 10001)."""
    result = request10001.GET('/v1/catalogos/relacion/elemento-comision/options')

    return result

  def page101(self):
    """GET options (request 10101)."""
    result = request10101.GET('/v1/catalogos/relacion/concurso-delito/options')

    return result

  def page102(self):
    """GET options (request 10201)."""
    result = request10201.GET('/v1/catalogos/relacion/clasificacion-delito-orden/options')

    return result

  def page103(self):
    """GET options (request 10301)."""
    result = request10301.GET('/v1/catalogos/relacion/modalidad-delito/options')

    return result

  def page104(self):
    """GET options (request 10401)."""
    result = request10401.GET('/v1/catalogos/relacion/forma-comision/options')

    return result

  def page105(self):
    """GET options (request 10501)."""
    result = request10501.GET('/v1/catalogos/relacion/forma-conducta/options')

    return result

  def page106(self):
    """GET 47 (request 10601)."""
    result = request10601.GET('/v1/base/lugares/casos/47')

    return result

  def page107(self):
    """GET 47 (request 10701)."""
    result = request10701.GET('/v1/base/vehiculos/casos/47')

    return result

  def page108(self):
    """GET 47 (request 10801)."""
    result = request10801.GET('/v1/base/armas/casos/47')

    return result

  def page109(self):
    """GET 47 (request 10901)."""
    result = request10901.GET('/v1/base/delitos-casos/casos/47')

    return result

  def page110(self):
    """GET 1 (request 11001)."""
    result = request11001.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/1')

    return result

  def page111(self):
    """GET 2 (request 11101)."""
    result = request11101.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/2')

    return result

  def page112(self):
    """GET 3 (request 11201)."""
    result = request11201.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/3')

    return result

  def page113(self):
    """GET 4 (request 11301)."""
    result = request11301.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/4')

    return result

  def page114(self):
    """GET 5 (request 11401)."""
    result = request11401.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/5')

    return result

  def page115(self):
    """GET 6 (request 11501)."""
    result = request11501.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/6')

    return result

  def page116(self):
    """GET 7 (request 11601)."""
    result = request11601.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/7')

    return result

  def page117(self):
    """GET 8 (request 11701)."""
    result = request11701.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/8')

    return result

  def page118(self):
    """GET 9 (request 11801)."""
    result = request11801.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/9')

    return result

  def page119(self):
    """GET 10 (request 11901)."""
    result = request11901.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/10')

    return result

  def page120(self):
    """GET 111 (request 12001)."""
    result = request12001.GET('/v1/base/personas-casos/casos/47/tipos-intervinientes/111')

    return result

  def page121(self):
    """GET page (request 12101)."""
    result = request12101.GET('/v1/base/personas-casos/casos/47/page')

    return result

  def page122(self):
    """OPTIONS tipo-relacion-persona (request 12201)."""
    result = request12201.OPTIONS('/v1/base/tipo-relacion-persona',
      '',
      ( NVPair('Accept', '*/*'),
        NVPair('Referer', 'http://10.0.30.14/sigi/caso/47/relaciones/create'), ))

    return result

  def page123(self):
    """POST tipo-relacion-persona (request 12301)."""
    result = request12301.POST('/v1/base/tipo-relacion-persona',
      '''{\n  \"id\": null,\n  \"flagrancia\": null,\n  \"tieneViolenciaGenero\": false,\n  \"caso\": {\n    \"id\": \"\"\n  },\n  \"clasificacionDelito\": {},\n  \"clasificacionDelitoOrden\": {},\n  \"concursoDelito\": {},\n  \"delitoCaso\": {\n    \"id\": 29\n  },\n  \"desaparicionConsumada\": {\n    \"id\": \"\"\n  },\n  \"elementoComision\": {\n    \"id\": 1\n  },\n  \"formaAccion\": {\n    \"id\": 0\n  },\n  \"formaComision\": {\n    \"id\": 0\n  },\n  \"formaConducta\": {},\n  \"gradoParticipacion\": {},\n  \"modalidadDelito\": {\n    \"id\": 0\n  },\n  \"violenciaGenero\": {\n    \"id\": \"\"\n  },\n  \"hostigamientoAcoso\": [],\n  \"trataPersona\": [],\n  \"efectoViolencia\": [],\n  \"tipoRelacionPersona\": {\n    \"tipo\": \"Imputado\",\n    \"personaCaso\": {\n      \"id\": 34\n    },\n    \"personaCasoRelacionada\": {\n      \"id\": 35\n    },\n    \"caso\": {\n      \"id\": \"47\"\n    },\n    \"lugarTipoRelacionPersona\": [\n      {\n        \"lugar\": {\n          \"id\": 27\n        }\n      }\n    ],\n    \"armaTipoRelacionPersona\": [\n      {\n        \"lugar\": {}\n      }\n    ],\n    \"vehiculoTipoRelacionPersona\": [\n      {\n        \"lugar\": {}\n      }\n    ]\n  }\n}''')

    return result

  def page124(self):
    """GET 47 (request 12401)."""
    result = request12401.GET('/v1/base/casos/47')

    return result

  def page125(self):
    """GET page (request 12501)."""
    result = request12501.GET('/v1/base/tipo-relacion-persona/casos/47/page')

    return result

  def __call__(self):
    """Called for every run performed by the worker thread."""
    self.page1()      # GET / (requests 101-107)

    grinder.sleep(87)
    self.page2()      # GET ionicons.min.css (request 201)

    grinder.sleep(5612)
    self.page3()      # GET options (request 301)
    self.page4()      # GET options (request 401)
    self.page5()      # GET options (request 501)
    self.page6()      # GET options (request 601)
    self.page7()      # GET options (request 701)
    self.page8()      # GET options (request 801)
    self.page9()      # GET options (request 901)
    self.page10()     # GET options (request 1001)
    self.page11()     # GET options (request 1101)
    self.page12()     # GET options (request 1201)
    self.page13()     # GET options (request 1301)
    self.page14()     # GET options (request 1401)
    self.page15()     # GET options (request 1501)
    self.page16()     # GET options (request 1601)
    self.page17()     # GET options (request 1701)
    self.page18()     # GET options (request 1801)
    self.page19()     # GET options (request 1901)
    self.page20()     # GET options (request 2001)
    self.page21()     # GET casos (request 2101)

    grinder.sleep(27812)
    self.page22()     # GET arma.svg (request 2201)

    grinder.sleep(45009)
    self.page23()     # GET search (request 2301)

    grinder.sleep(9321)
    self.page24()     # OPTIONS casos (request 2401)

    grinder.sleep(71)
    self.page25()     # POST casos (request 2501)

    grinder.sleep(35)
    self.page26()     # GET 47 (request 2601)
    self.page27()     # GET 47 (request 2701)

    grinder.sleep(13123)
    self.page28()     # GET page (request 2801)

    grinder.sleep(2618)
    self.page29()     # GET options (request 2901)
    self.page30()     # GET options (request 3001)
    self.page31()     # GET options (request 3101)
    self.page32()     # GET options (request 3201)
    self.page33()     # GET options (request 3301)
    self.page34()     # GET options (request 3401)
    self.page35()     # GET options (request 3501)
    self.page36()     # GET options (request 3601)
    self.page37()     # GET options (request 3701)
    self.page38()     # GET options (request 3801)
    self.page39()     # GET options (request 3901)
    self.page40()     # GET options (request 4001)
    self.page41()     # GET options (request 4101)
    self.page42()     # GET options (request 4201)
    self.page43()     # GET options (request 4301)
    self.page44()     # GET options (request 4401)
    self.page45()     # GET options (request 4501)
    self.page46()     # GET options (request 4601)

    grinder.sleep(29325)
    self.page47()     # OPTIONS personas (request 4701)
    self.page48()     # POST personas (request 4801)

    grinder.sleep(62)
    self.page49()     # GET 47 (request 4901)
    self.page50()     # GET page (request 5001)

    grinder.sleep(33319)
    self.page51()     # GET options (request 5101)
    self.page52()     # GET options (request 5201)
    self.page53()     # GET options (request 5301)
    self.page54()     # GET options (request 5401)
    self.page55()     # GET options (request 5501)
    self.page56()     # GET options (request 5601)
    self.page57()     # GET options (request 5701)
    self.page58()     # GET options (request 5801)
    self.page59()     # GET options (request 5901)
    self.page60()     # GET options (request 6001)
    self.page61()     # GET options (request 6101)
    self.page62()     # GET options (request 6201)
    self.page63()     # GET options (request 6301)
    self.page64()     # GET options (request 6401)
    self.page65()     # GET options (request 6501)
    self.page66()     # GET options (request 6601)
    self.page67()     # GET options (request 6701)
    self.page68()     # GET options (request 6801)

    grinder.sleep(38448)
    self.page69()     # POST personas (request 6901)

    grinder.sleep(95)
    self.page70()     # GET 47 (request 7001)
    self.page71()     # GET page (request 7101)

    grinder.sleep(18897)
    self.page72()     # GET page (request 7201)

    grinder.sleep(4401)
    self.page73()     # GET options (request 7301)
    self.page74()     # GET options (request 7401)
    self.page75()     # GET options (request 7501)
    self.page76()     # GET options (request 7601)
    self.page77()     # GET options (request 7701)
    self.page78()     # GET options (request 7801)
    self.page79()     # GET options (request 7901)
    self.page80()     # GET options (request 8001)
    self.page81()     # GET options (request 8101)
    self.page82()     # GET options (request 8201)
    self.page83()     # GET options (request 8301)
    self.page84()     # GET options (request 8401)
    self.page85()     # GET options (request 8501)
    self.page86()     # GET options (request 8601)
    self.page87()     # GET options (request 8701)
    self.page88()     # GET options (request 8801)
    self.page89()     # GET options (request 8901)
    self.page90()     # GET options (request 9001)

    grinder.sleep(15911)
    self.page91()     # GET options (request 9101)

    grinder.sleep(55592)
    self.page92()     # OPTIONS lugares (request 9201)
    self.page93()     # POST lugares (request 9301)

    grinder.sleep(45)
    self.page94()     # GET 47 (request 9401)
    self.page95()     # GET page (request 9501)

    grinder.sleep(33229)
    self.page96()     # GET page (request 9601)

    grinder.sleep(8022)
    self.page97()     # GET options (request 9701)
    self.page98()     # GET options (request 9801)
    self.page99()     # GET options (request 9901)
    self.page100()    # GET options (request 10001)
    self.page101()    # GET options (request 10101)
    self.page102()    # GET options (request 10201)
    self.page103()    # GET options (request 10301)
    self.page104()    # GET options (request 10401)
    self.page105()    # GET options (request 10501)
    self.page106()    # GET 47 (request 10601)
    self.page107()    # GET 47 (request 10701)
    self.page108()    # GET 47 (request 10801)
    self.page109()    # GET 47 (request 10901)
    self.page110()    # GET 1 (request 11001)
    self.page111()    # GET 2 (request 11101)
    self.page112()    # GET 3 (request 11201)
    self.page113()    # GET 4 (request 11301)
    self.page114()    # GET 5 (request 11401)
    self.page115()    # GET 6 (request 11501)
    self.page116()    # GET 7 (request 11601)
    self.page117()    # GET 8 (request 11701)
    self.page118()    # GET 9 (request 11801)
    self.page119()    # GET 10 (request 11901)
    self.page120()    # GET 111 (request 12001)
    self.page121()    # GET page (request 12101)

    grinder.sleep(43900)
    self.page122()    # OPTIONS tipo-relacion-persona (request 12201)
    self.page123()    # POST tipo-relacion-persona (request 12301)

    grinder.sleep(41)
    self.page124()    # GET 47 (request 12401)
    self.page125()    # GET page (request 12501)


# Instrument page methods.
Test(100, 'Page 1').record(TestRunner.page1)
Test(200, 'Page 2').record(TestRunner.page2)
Test(300, 'Page 3').record(TestRunner.page3)
Test(400, 'Page 4').record(TestRunner.page4)
Test(500, 'Page 5').record(TestRunner.page5)
Test(600, 'Page 6').record(TestRunner.page6)
Test(700, 'Page 7').record(TestRunner.page7)
Test(800, 'Page 8').record(TestRunner.page8)
Test(900, 'Page 9').record(TestRunner.page9)
Test(1000, 'Page 10').record(TestRunner.page10)
Test(1100, 'Page 11').record(TestRunner.page11)
Test(1200, 'Page 12').record(TestRunner.page12)
Test(1300, 'Page 13').record(TestRunner.page13)
Test(1400, 'Page 14').record(TestRunner.page14)
Test(1500, 'Page 15').record(TestRunner.page15)
Test(1600, 'Page 16').record(TestRunner.page16)
Test(1700, 'Page 17').record(TestRunner.page17)
Test(1800, 'Page 18').record(TestRunner.page18)
Test(1900, 'Page 19').record(TestRunner.page19)
Test(2000, 'Page 20').record(TestRunner.page20)
Test(2100, 'Page 21').record(TestRunner.page21)
Test(2200, 'Page 22').record(TestRunner.page22)
Test(2300, 'Page 23').record(TestRunner.page23)
Test(2400, 'Page 24').record(TestRunner.page24)
Test(2500, 'Page 25').record(TestRunner.page25)
Test(2600, 'Page 26').record(TestRunner.page26)
Test(2700, 'Page 27').record(TestRunner.page27)
Test(2800, 'Page 28').record(TestRunner.page28)
Test(2900, 'Page 29').record(TestRunner.page29)
Test(3000, 'Page 30').record(TestRunner.page30)
Test(3100, 'Page 31').record(TestRunner.page31)
Test(3200, 'Page 32').record(TestRunner.page32)
Test(3300, 'Page 33').record(TestRunner.page33)
Test(3400, 'Page 34').record(TestRunner.page34)
Test(3500, 'Page 35').record(TestRunner.page35)
Test(3600, 'Page 36').record(TestRunner.page36)
Test(3700, 'Page 37').record(TestRunner.page37)
Test(3800, 'Page 38').record(TestRunner.page38)
Test(3900, 'Page 39').record(TestRunner.page39)
Test(4000, 'Page 40').record(TestRunner.page40)
Test(4100, 'Page 41').record(TestRunner.page41)
Test(4200, 'Page 42').record(TestRunner.page42)
Test(4300, 'Page 43').record(TestRunner.page43)
Test(4400, 'Page 44').record(TestRunner.page44)
Test(4500, 'Page 45').record(TestRunner.page45)
Test(4600, 'Page 46').record(TestRunner.page46)
Test(4700, 'Page 47').record(TestRunner.page47)
Test(4800, 'Page 48').record(TestRunner.page48)
Test(4900, 'Page 49').record(TestRunner.page49)
Test(5000, 'Page 50').record(TestRunner.page50)
Test(5100, 'Page 51').record(TestRunner.page51)
Test(5200, 'Page 52').record(TestRunner.page52)
Test(5300, 'Page 53').record(TestRunner.page53)
Test(5400, 'Page 54').record(TestRunner.page54)
Test(5500, 'Page 55').record(TestRunner.page55)
Test(5600, 'Page 56').record(TestRunner.page56)
Test(5700, 'Page 57').record(TestRunner.page57)
Test(5800, 'Page 58').record(TestRunner.page58)
Test(5900, 'Page 59').record(TestRunner.page59)
Test(6000, 'Page 60').record(TestRunner.page60)
Test(6100, 'Page 61').record(TestRunner.page61)
Test(6200, 'Page 62').record(TestRunner.page62)
Test(6300, 'Page 63').record(TestRunner.page63)
Test(6400, 'Page 64').record(TestRunner.page64)
Test(6500, 'Page 65').record(TestRunner.page65)
Test(6600, 'Page 66').record(TestRunner.page66)
Test(6700, 'Page 67').record(TestRunner.page67)
Test(6800, 'Page 68').record(TestRunner.page68)
Test(6900, 'Page 69').record(TestRunner.page69)
Test(7000, 'Page 70').record(TestRunner.page70)
Test(7100, 'Page 71').record(TestRunner.page71)
Test(7200, 'Page 72').record(TestRunner.page72)
Test(7300, 'Page 73').record(TestRunner.page73)
Test(7400, 'Page 74').record(TestRunner.page74)
Test(7500, 'Page 75').record(TestRunner.page75)
Test(7600, 'Page 76').record(TestRunner.page76)
Test(7700, 'Page 77').record(TestRunner.page77)
Test(7800, 'Page 78').record(TestRunner.page78)
Test(7900, 'Page 79').record(TestRunner.page79)
Test(8000, 'Page 80').record(TestRunner.page80)
Test(8100, 'Page 81').record(TestRunner.page81)
Test(8200, 'Page 82').record(TestRunner.page82)
Test(8300, 'Page 83').record(TestRunner.page83)
Test(8400, 'Page 84').record(TestRunner.page84)
Test(8500, 'Page 85').record(TestRunner.page85)
Test(8600, 'Page 86').record(TestRunner.page86)
Test(8700, 'Page 87').record(TestRunner.page87)
Test(8800, 'Page 88').record(TestRunner.page88)
Test(8900, 'Page 89').record(TestRunner.page89)
Test(9000, 'Page 90').record(TestRunner.page90)
Test(9100, 'Page 91').record(TestRunner.page91)
Test(9200, 'Page 92').record(TestRunner.page92)
Test(9300, 'Page 93').record(TestRunner.page93)
Test(9400, 'Page 94').record(TestRunner.page94)
Test(9500, 'Page 95').record(TestRunner.page95)
Test(9600, 'Page 96').record(TestRunner.page96)
Test(9700, 'Page 97').record(TestRunner.page97)
Test(9800, 'Page 98').record(TestRunner.page98)
Test(9900, 'Page 99').record(TestRunner.page99)
Test(10000, 'Page 100').record(TestRunner.page100)
Test(10100, 'Page 101').record(TestRunner.page101)
Test(10200, 'Page 102').record(TestRunner.page102)
Test(10300, 'Page 103').record(TestRunner.page103)
Test(10400, 'Page 104').record(TestRunner.page104)
Test(10500, 'Page 105').record(TestRunner.page105)
Test(10600, 'Page 106').record(TestRunner.page106)
Test(10700, 'Page 107').record(TestRunner.page107)
Test(10800, 'Page 108').record(TestRunner.page108)
Test(10900, 'Page 109').record(TestRunner.page109)
Test(11000, 'Page 110').record(TestRunner.page110)
Test(11100, 'Page 111').record(TestRunner.page111)
Test(11200, 'Page 112').record(TestRunner.page112)
Test(11300, 'Page 113').record(TestRunner.page113)
Test(11400, 'Page 114').record(TestRunner.page114)
Test(11500, 'Page 115').record(TestRunner.page115)
Test(11600, 'Page 116').record(TestRunner.page116)
Test(11700, 'Page 117').record(TestRunner.page117)
Test(11800, 'Page 118').record(TestRunner.page118)
Test(11900, 'Page 119').record(TestRunner.page119)
Test(12000, 'Page 120').record(TestRunner.page120)
Test(12100, 'Page 121').record(TestRunner.page121)
Test(12200, 'Page 122').record(TestRunner.page122)
Test(12300, 'Page 123').record(TestRunner.page123)
Test(12400, 'Page 124').record(TestRunner.page124)
Test(12500, 'Page 125').record(TestRunner.page125)
