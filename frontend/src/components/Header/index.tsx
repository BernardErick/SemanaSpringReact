import logo from '../../assets/img/logo.svg'
import './styles.css'
function Header(){
    return (
        <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta - Semana Spring & React</h1>
            <p>
              Desenvolvido por
              <a href="https://github.com/BernardErick">@bernarderick.github</a>
            </p>
        </div>
    </header>
    )
}
export default Header