<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Feedback</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->
<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css"/>

<!-- Inline CSS based on choices in "Settings" tab -->
<style>.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p, .bootstrap-iso form{font-family: Arial,
    Helvetica, sans-serif; color: black}.bootstrap-iso form button, .bootstrap-iso form button:hover{color: white
    !important;} .asteriskField{color: red;}
</style>
<h1>${greeting}</h1>
<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
<div class="bootstrap-iso">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
                <form method="post">
                    <div class="form-group ">
                        <label class="control-label requiredField">
                            Qual a sua expectativa em rela&ccedil;&atilde;o ao servi&ccedil;o?
       <span class="asteriskField">
        *
       </span>
                        </label>
                        <div class="">
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio" type="radio"
                                           value="Muito boa (&eacute; o que precisava ha tempos)"/>
                                    Muito boa (&eacute; o que precisava ha tempos)
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio" type="radio" value="Boa"/>
                                    Boa
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio" type="radio"
                                           value="N&atilde;o acho que o mercado precise de um servi&ccedil;o desses"/>
                                    N&atilde;o acho que o mercado precise de um servi&ccedil;o desses
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio" type="radio" value="N&atilde;o sei"/>
                                    N&atilde;o sei
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group ">
                        <label class="control-label requiredField">
                            Em quanto tempo voc&ecirc; espera que o servi&ccedil;o esteja dispon&iacute;vel?
       <span class="asteriskField">
        *
       </span>
                        </label>
                        <div class="">
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio1" type="radio" value="3 meses"/>
                                    3 meses
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio1" type="radio" value="6 meses"/>
                                    6 meses
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio1" type="radio" value="12 meses"/>
                                    12 meses
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group ">
                        <label class="control-label requiredField">
                            Voc&ecirc; gostaria de uma vers&atilde;o que considere tamb&eacute;m dados sobre transporte,
                            educa&ccedil;&atilde;o, violencia... De fontes alternativas?
       <span class="asteriskField">
        *
       </span>
                        </label>
                        <div class="">
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio2" type="radio"
                                           value="Sim (as informa&ccedil;&otilde;es fornecidas pelo governo s&atilde;o maquiadas)"/>
                                    Sim (as informa&ccedil;&otilde;es fornecidas pelo governo s&atilde;o maquiadas)
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio2" type="radio"
                                           value="N&atilde;o (prefiro contar apenas com dados oficiais do governo))"/>
                                    N&atilde;o (prefiro contar apenas com dados oficiais do governo))
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group ">
                        <label class="control-label requiredField">
                            Quais os meios que voc&ecirc; usa hoje para obter informa&ccedil;&otilde;es e encontrar um
                            im&oacute;vel em uma cidade pouco conhecida?
       <span class="asteriskField">
        *
       </span>
                        </label>
                        <div class="">
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio3" type="radio" value="Imobili&aacute;ria"/>
                                    Imobili&aacute;ria
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio3" type="radio" value="Sites de venda/aluga imovel"/>
                                    Sites de venda/aluga imovel
                                </label>
                            </div>
                            <div class="radio">
                                <label class="radio">
                                    <input name="radio3" type="radio"
                                           value="Familia/amigos que conhecem um pouco sobre o local"/>
                                    Familia/amigos que conhecem um pouco sobre o local
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div>
                            <button class="btn btn-primary " name="submit" type="submit">
                                Submit
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="js/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="../../assets/js/vendor/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>